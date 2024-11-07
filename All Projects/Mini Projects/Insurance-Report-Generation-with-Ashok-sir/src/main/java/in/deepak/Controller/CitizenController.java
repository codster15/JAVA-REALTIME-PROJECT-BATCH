package in.deepak.Controller;


import in.deepak.Entity.citizenEntity;
import in.deepak.ReportService.ReportService_Interface;
import in.deepak.SearchRequest.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class CitizenController {

    @Autowired
    private ReportService_Interface reportServiceImpl;


    @GetMapping("/")
    public String LoadIndex(Model model) {

        List<String> plan = reportServiceImpl.loadPlan();
        List<String> status = reportServiceImpl.loadStatus();

        model.addAttribute("plan", plan);
        model.addAttribute("status", status);

        return "index";
    }


    @PostMapping("/submit")
    public String SubmitData(Model model,
                             @RequestParam String plan,  // matches name="plan"
                             @RequestParam String status, // matches name="status"
                             @RequestParam String gender, // matches name="gender"
                             @RequestParam String startDate, // matches name="startDate"
                             @RequestParam String endDate // matches name="endDate"
                                                                                              ) {

        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);

        SearchRequest searchObject = new SearchRequest();
        searchObject.setPlanName(plan);
        searchObject.setPlanStatus(status);
        searchObject.setGender(gender);
        searchObject.setStartDate(start);
        searchObject.setEndDate(end);
        SearchRequest search = reportServiceImpl.search(searchObject);


        List<citizenEntity> allCitizen = reportServiceImpl.findAllCitizen();

        allCitizen.forEach(e-> System.out.println(e));
        model.addAttribute("citizenList" , allCitizen);


        return "index";

    }


}
