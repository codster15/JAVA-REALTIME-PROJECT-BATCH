package in.deepak.ReportService;


import in.deepak.Entity.citizenEntity;
import in.deepak.SearchRequest.SearchRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;


public interface ReportService_Interface {



    public  List<String> loadPlan ();

    public List<String> loadStatus ();

    public boolean pdfGenerate(HttpServletResponse response)throws IOException;

    public  boolean excelGenerate(HttpServletResponse response) throws IOException;

    public List<citizenEntity> search (SearchRequest searchRequest);


}
