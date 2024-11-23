package in.deepak.Controller;


import in.deepak.Entity.citizenEntity;
import in.deepak.ReportService.ReportService_Interface;
import in.deepak.SearchRequest.SearchRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@Controller
public class CitizenController {

    @Autowired
    private ReportService_Interface reportServiceImpl;

                    public void init (Model model){
                        model.addAttribute("plan", reportServiceImpl.loadPlan());
                        model.addAttribute("status", reportServiceImpl.loadStatus());
                    }
//====================================================================================================================================




                                                                                                /**
                                                                                                 * This Method is Used to Load The Index Page
                                                                                                 * @param model
                                                                                                 * @return String
                                                                                                 */
                @GetMapping("/")
                public String LoadIndex(Model model) {
                    model.addAttribute("searching" ,new SearchRequest());
                    init(model);
                    return "index";
                }




//====================================================================================================================================



                                                                                            /**
                                                                                             * with this method i am capturing the form data
                                                                                             * @param search
                                                                                             * @param model
                                                                                             * @return
                                                                                             */
    @PostMapping("/search")
    public String handleSearch (@ModelAttribute ("search") SearchRequest search , Model model){

        model.addAttribute("searching" ,search);

        init(model);

        List<citizenEntity> search1 = reportServiceImpl.search(search);
        model.addAttribute("citizenList" , search1);


        return "index";
    }




//====================================================================================================================================



    @GetMapping("/excel")
    public void excelExport(HttpServletResponse response) throws Exception {
        response.setContentType("application/octet-stream");
        response.addHeader("Content-Disposition" , "attachment;filename = Citizen-Data.xls");
        reportServiceImpl.excelGenerate(response);
    }


}

