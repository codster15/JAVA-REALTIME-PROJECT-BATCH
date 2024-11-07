package in.deepak.ReportService;


import in.deepak.Entity.citizenEntity;
import in.deepak.SearchRequest.SearchRequest;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ReportService_Interface {

    public List<citizenEntity> findAllCitizen();

    public  List<String> loadPlan ();

    public List<String> loadStatus ();

    public boolean pdfGenerate();

    public  boolean excelGenerate();

    public SearchRequest search (SearchRequest searchRequest);


}
