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
    public List<citizenEntity> search(SearchRequest searchRequest) {
        return null;
    }
}
