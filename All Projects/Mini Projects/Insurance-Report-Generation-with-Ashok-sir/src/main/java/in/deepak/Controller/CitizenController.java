package in.deepak.Controller;


import in.deepak.ReportService.ReportService_impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CitizenController {

    @Autowired
    private ReportService_impl reportServiceImpl;


    @GetMapping("/")
    public String LoadIndex(Model model){

        List<String> plan = reportServiceImpl.loadPlan();

        List<String> status = reportServiceImpl.loadStatus();


        model.addAttribute("plan" , plan);
        model.addAttribute("status" , status);

        return "index";
    }




}
