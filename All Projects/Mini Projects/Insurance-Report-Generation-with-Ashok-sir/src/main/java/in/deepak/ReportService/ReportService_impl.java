package in.deepak.ReportService;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import in.deepak.CitizenRepo.CitizenRepositiory;
import in.deepak.Entity.citizenEntity;
import in.deepak.ReportService.utils.excelExport;

import in.deepak.ReportService.utils.mailAttachment;
import in.deepak.ReportService.utils.pdfExport;
import in.deepak.SearchRequest.SearchRequest;
import jakarta.mail.MessagingException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

@Service
public class ReportService_impl implements ReportService_Interface {

    @Autowired
    private CitizenRepositiory citizenRepositiory;

    @Autowired
    private excelExport excel;

    @Autowired
    private pdfExport pdf;

    @Autowired
    private mailAttachment mailSender;



    //------------------------------------------------------------------------------------------------------------------------------

    // > Capture Search data

                        @Override
                        public List<citizenEntity> search(SearchRequest searchRequest) {

                            citizenEntity citi = new citizenEntity();

                            if(searchRequest.getPlanName() != null && searchRequest.getPlanName()!= ""){
                                citi.setPlanName(searchRequest.planName);
                            } if(searchRequest.getPlanStatus() != null && searchRequest.getPlanStatus()!= ""){
                                citi.setPlanStatus(searchRequest.planStatus);
                            } if(searchRequest.getGender() != null && searchRequest.getGender()!= ""){
                                citi.setGender(searchRequest.gender);
                            } if(searchRequest.getStartDate() != null ) {
                                citi.setStartDate(searchRequest.startDate);}


                                if (searchRequest.getEndDate() != null) {
                                    citi.setEndDate(searchRequest.endDate);
                                }

                                    List<citizenEntity> all = citizenRepositiory.findAll(Example.of(citi));

                                    return all;
                                }


   //-----------------------------------------------------------------------------------------------------------------


    // > Load plan

                        @Override
                        public List<String> loadPlan() {
                            List<String> plan = citizenRepositiory.LoadPlan();

                            return plan;
                        }


    //-----------------------------------------------------------------------------------------------------------------


    // > Load Status


                        @Override
                        public List<String> loadStatus() {
                            List<String> status = citizenRepositiory.LoadStatus();
                            status.forEach(e -> System.out.println(e));

                            return status;
                        }




    //-----------------------------------------------------------------------------------------------------------------




    // > Excel
                        @Override
                        public boolean excelGenerate(HttpServletResponse response) throws IOException, MessagingException {
                            File file = new File("Citizen.xls");
                            List<citizenEntity> all = citizenRepositiory.findAll();
                            excel.excelGenerate(response,all);


                            String body = "Test Mail Sender";
                            String subject = " <h1> test Mail Body </h1>";
                            String to = "deepaksingh.desire@gmail.com";


                            mailSender.mailSender(subject , body , to ,file);
                            file.delete();

                            return true;
                        }




    //-----------------------------------------------------------------------------------------------


        // > PDF
                        @Override
                        public boolean pdfGenerate(HttpServletResponse response ) throws IOException, MessagingException {

                            List<citizenEntity> all = citizenRepositiory.findAll();

                            File file = pdf.pdfExport(response, all);

                            String body = "Test Mail Sender";
                            String subject = " <h1> test Mail Body </h1>";
                            String to = "deepaksingh.desire@gmail.com";

                            mailSender.mailSender(subject , body , to ,file);

                            return true;
                        }


}
