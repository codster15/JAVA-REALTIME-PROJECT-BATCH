package in.deepak.ReportService;

import in.deepak.CitizenRepo.CitizenRepositiory;
import in.deepak.Entity.citizenEntity;
import in.deepak.SearchRequest.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReportService_impl implements ReportService_Interface {

    @Autowired
    private CitizenRepositiory citizenRepositiory;

    @Override
    public List<String> loadPlan() {
        List<String> plan = citizenRepositiory.LoadPlan();

        plan.forEach(e-> System.out.println(e));
        System.out.println("============================================================================================================================");

        return plan;
    }

    @Override
    public List<String> loadStatus() {
        List<String> status = citizenRepositiory.LoadStatus();
        status.forEach(e-> System.out.println(e));

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
        String planName = searchRequest.getPlanName();
        String planStatus = searchRequest.getPlanStatus();
        String gender = searchRequest.getGender();
        LocalDate startDate = searchRequest.getStartDate();
        LocalDate endDate = searchRequest.getEndDate();

//        SearchRequest citiEn = new citizenEntity();
//        citiEn.setPlanName(planName);
//        citiEn.setPlanStatus(planStatus);
//        citiEn.setGender(gender);
//        citiEn.setStartDate(startDate);
//        citiEn.setEndDate(endDate);



        return searchRequest;
    }
}
