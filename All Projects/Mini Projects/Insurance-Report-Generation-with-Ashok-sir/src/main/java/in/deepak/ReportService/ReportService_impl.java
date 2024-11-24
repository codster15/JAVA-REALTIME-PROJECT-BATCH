package in.deepak.ReportService;

import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
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





    //-----------------------------------------------------------------------------------------------------------------



    @Override
    public boolean excelGenerate(HttpServletResponse response) throws IOException {


//. Create Workbook & Sheet: Initialize HSSFWorkbook and create a sheet.
//. Add Headers: Define column names for the data.
//. Fetch Data: Retrieve records from the database.
//. Populate Rows: Loop through the data and fill each row with values.
//. Handle Nulls: Set "N/A" for missing values (e.g., Benefit Amount, Terminated Reason).
//. Write & Download: Write the workbook to the response output stream for download.
//. Close Workbook: Close the workbook after writing the data.

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

            if(citi.getBenefitAmount() != null ){
                row.createCell(6).setCellValue(citi.getBenefitAmount());
            }else{
                row.createCell(6).setCellValue("N/A");
            }

            if(citi.getTerminatedReason() != null && citi.getTerminatedReason() != ""){
                row.createCell(7).setCellValue(citi.getTerminatedReason());
            }else{
                row.createCell(7).setCellValue("N/A");
            }


            rowIndex++;


        }
        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();

        return true;
    }

    //-----------------------------------------------------------------------------------------------



    @Override
    public boolean pdfGenerate(HttpServletResponse response) throws IOException {

//. Add Dependencies: Include libraries like iText or Apache PDFBox in your pom.xml for PDF creation.
//. Create Document: Initialize a Document object and set up a PdfWriter to write the content.
//. Set Document Properties: Set the page size, margins, and other document properties.
//. Add Content: Use methods like add() to insert text, tables, images, etc., into the PDF.
//. Fetch Data: Retrieve the data you want to display in the PDF, similar to the approach used for Excel.
//. Format Content: Format the content (e.g., font size, alignment) using appropriate classes.
//. Write to Response: Write the generated PDF document to the HttpServletResponse output stream for download.
//. Close Document: Close the document to save and release resources.


        Document document = new Document(PageSize.A4);
            document.open();

        Paragraph p = new Paragraph("Citizen-Plan-Info");
        document.add(p);

        PdfPTable table = new PdfPTable(8);
        table.addCell("ID");
        table.addCell("Name");
        table.addCell("Plan Name");
        table.addCell("Plan Status");
        table.addCell("Start Date");
        table.addCell("End Date");
        table.addCell("Benefit Amount");
        table.addCell("Terminated Reason");



        return false;
    }


}
