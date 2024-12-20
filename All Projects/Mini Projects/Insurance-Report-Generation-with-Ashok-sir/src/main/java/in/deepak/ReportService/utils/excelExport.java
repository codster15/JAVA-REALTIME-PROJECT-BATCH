package in.deepak.ReportService.utils;

import in.deepak.Entity.citizenEntity;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Component
public class excelExport {
    //===   Excel  ===

    //. Create Workbook & Sheet: Initialize HSSFWorkbook and create a sheet.
//. Add Headers: Define column names for the data.
//. Fetch Data: Retrieve records from the database.
//. Populate Rows: Loop through the data and fill each row with values.
//. Handle Nulls: Set "N/A" for missing values (e.g., Benefit Amount, Terminated Reason).
//. Write & Download: Write the workbook to the response output stream for download.
//. Close Workbook: Close the workbook after writing the data
    public void excelGenerate(HttpServletResponse response , List<citizenEntity> all ) throws IOException {

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

        FileOutputStream fos = new FileOutputStream(new File("Citizen.xls"));
        workbook.write(fos);
        fos.close();


        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();

    }

}
