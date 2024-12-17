package in.deepak.ReportService.utils;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import in.deepak.Entity.citizenEntity;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class pdfExport {


    //===   pdf  ===

//. Add Dependencies: Include libraries like iText or Apache PDFBox in your pom.xml for PDF creation.
//. Create Document: Initialize a Document object and set up a PdfWriter to write the content.
//. Set Document Properties: Set the page size, margins, and other document properties.
//. Add Content: Use methods like add() to insert text, tables, images, etc., into the PDF.
//. Fetch Data: Retrieve the data you want to display in the PDF, similar to the approach used for Excel.
//. Format Content: Format the content (e.g., font size, alignment) using appropriate classes.
//. Write to Response: Write the generated PDF document to the HttpServletResponse output stream for download.
//. Close Document: Close the document to save and release resources.

    public void pdfExport(HttpServletResponse response , List<citizenEntity> all ) throws IOException {

        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document , response.getOutputStream());

        document.open();


        Paragraph p = new Paragraph("Citizen-Plan-Info");
        p.setAlignment(Paragraph.ALIGN_CENTER);
        document.add(p);
        // Add some space between the paragraph and the table
        document.add(Chunk.NEWLINE);  // Adds a single newline space




        PdfPTable table = new PdfPTable(8);
        table.addCell("ID");
        table.addCell("Name");
        table.addCell("Plan Name");
        table.addCell("Plan Status");
        table.addCell("Start Date");
        table.addCell("End Date");
        table.addCell("Benefit Amount");
        table.addCell("Terminated Reason");



        for (citizenEntity citi : all){
            table.addCell(String.valueOf(citi.getId()));
            table.addCell(citi.getName());
            table.addCell(citi.getPlanName());
            table.addCell(citi.getPlanStatus());
            table.addCell(String.valueOf(citi.getStartDate()));
            table.addCell(String.valueOf(citi.getEndDate()));
            table.addCell(String.valueOf(citi.getBenefitAmount()));
            table.addCell(citi.getTerminatedReason());

        }

        document.add(table);


        document.close();
    }


}
