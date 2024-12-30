package in.deepak.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EnquiryController {

    @GetMapping("/dashboard")
    public String dashboard(){
        return "dashboard";
    }

    @GetMapping("/addEnquiry")
    public String addEnquiry(){
        return "addEnquiry";
    }

    @GetMapping("/viewEnquiries")
    public String viewEnquiries(){
        return "viewEnquiries";
    }


}
