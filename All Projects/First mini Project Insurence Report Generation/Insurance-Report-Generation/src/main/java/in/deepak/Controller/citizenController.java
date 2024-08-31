package in.deepak.Controller;


import in.deepak.Entity.Citizens;
import in.deepak.service.serviceClass;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class citizenController {


    @GetMapping("/")
   private String LoadIndex(Model model){

        Citizens c = new Citizens();
        serviceClass  sc = new serviceClass();


        model.addAttribute("humans" , c);
        model.addAttribute("plan" ,sc.loadPlan() );
        model.addAttribute("status" ,sc.loadStatus() );





       return "index";
   }



}
