package in.deepak.ReportService;

import in.deepak.CitizenRepo.CitizenRepositiory;
import in.deepak.Entity.citizenEntity;
import in.deepak.SearchRequest.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

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
    public boolean excelGenerate() {
        return false;
    }


}
