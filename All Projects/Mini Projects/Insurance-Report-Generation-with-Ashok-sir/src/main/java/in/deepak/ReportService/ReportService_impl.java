package in.deepak.ReportService;

import in.deepak.CitizenRepo.CitizenRepositiory;
import in.deepak.Entity.citizenEntity;
import in.deepak.SearchRequest.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService_impl implements ReportService_Interface {

    @Autowired
    private CitizenRepositiory citizenRepositiory;

    @Override
    public List<citizenEntity> findAllCitizen() {
        List<citizenEntity> all = citizenRepositiory.findAll();
        return all;
    }


    @Override
    public List<String> loadPlan() {
        List<String> plan = citizenRepositiory.LoadPlan();

        return plan;
    }

    @Override
    public List<String> loadStatus() {
        List<String> status = citizenRepositiory.LoadStatus();
        status.forEach(e -> System.out.println(e));

        return status;
    }

    @Override
    public boolean pdfGenerate() {
        return false;
    }

    @Override
    public boolean excelGenerate() {
        return false;
    }

    @Override
    public SearchRequest search(SearchRequest searchRequest) {
//                    String planName = searchRequest.getPlanName();
//                    String planStatus = searchRequest.getPlanStatus();
//                    String gender = searchRequest.getGender();
//                    LocalDate startDate = searchRequest.getStartDate();
//                    LocalDate endDate = searchRequest.getEndDate();


        return searchRequest;
    }
}
