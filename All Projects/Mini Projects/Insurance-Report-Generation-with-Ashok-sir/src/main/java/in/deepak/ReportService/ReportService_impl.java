package in.deepak.ReportService;

import in.deepak.CitizenRepo.CitizenRepositiory;
import in.deepak.Entity.citizenEntity;
import in.deepak.SearchRequest.SearchRequest;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ReportService_impl implements ReportService_Interface {

    @Autowired
    private CitizenRepositiory citizenRepositiory;

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



    @Override
    public List<String> loadPlan() {
        List<String> plan = citizenRepositiory.LoadPlan();

        return plan;
    }


    //-----------------------------------------------------------------------------------------------------------------



    @Override
    public List<String> loadStatus() {
        List<String> status = citizenRepositiory.LoadStatus();
        status.forEach(e -> System.out.println(e));

        return status;
    }

    //-----------------------------------------------------------------------------------------------------------------


    @Override
    public boolean pdfGenerate() {
        return false;
    }


    //-----------------------------------------------------------------------------------------------------------------



    @Override
    public boolean excelGenerate(HttpServletResponse response) throws IOException {

        Workbook workbook = new HSSFWorkbook();

        Sheet sheet = workbook.createSheet("Citizen-Data");

        Row headerRow = sheet.createRow(0);

        headerRow.createCell(0).setCellValue("ID");
        headerRow.createCell(1).setCellValue("Name");
        headerRow.createCell(2).setCellValue("Plane Name");
        headerRow.createCell(3).setCellValue("Plan Status");
        headerRow.createCell(4).setCellValue("Start Date ");
        headerRow.createCell(5).setCellValue("ENd Date");
        headerRow.createCell(6).setCellValue("Benefit Amount");
        headerRow.createCell(7).setCellValue("Terminated Reason");

        List<citizenEntity> all = citizenRepositiory.findAll();

        int rowIndex = 1;

        for (citizenEntity citi : all){
            Row row = sheet.createRow(rowIndex);
            row.createCell(0).setCellValue(citi.getId());
            row.createCell(1).setCellValue(citi.getName());
            row.createCell(2).setCellValue(citi.getPlanName());
            row.createCell(3).setCellValue(citi.getPlanStatus());
            row.createCell(4).setCellValue(citi.getStartDate());
            row.createCell(5).setCellValue(citi.getEndDate());
            row.createCell(6).setCellValue(citi.getBenefitAmount());
            row.createCell(7).setCellValue(citi.getTerminatedReason());

            rowIndex++;


        }

        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();

        return true;
    }


}
