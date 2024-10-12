package in.deepak.Controller;


import in.deepak.Entity.Citizens;
import in.deepak.Entity.PlanName;
import in.deepak.Entity.status;
import in.deepak.Repositiory.CitizenRepositiory;
import in.deepak.service.serviceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class citizenController {


    @Autowired
    private serviceClass sc;


    @Autowired
    private CitizenRepositiory citiRepo;




                        @GetMapping("/")
                       private String LoadIndex(Model model){

                            Citizens c = new Citizens();


                            System.out.println("================  Load Plan   =================================");

                            List<PlanName> plan = sc.loadPlan();
                            String str[] = new String[plan.size()];
                                int []count = {0};

                              plan.forEach(e->{
                                  str[count[0]] = e.getPlanName();
                                  count[0]++;
                              } );

                              ///--------------------------------------------------------------------------------------------------------------------------------

                            System.out.println("===============  Status   ===================================");

                            List<status> planNames = sc.loadStatus();
                            String []arr2 = new String[planNames.size()];
                            int []pass = {0};

                            planNames.forEach(e-> {
                            arr2[pass[0]] = e.getPlanStatus();
                            pass[0]++;
                            });

                            //----------------------------------------------------------------------------------------------------------------------------------------

                                                            model.addAttribute("humans" , c);
                                                            model.addAttribute("plan" ,str);
                                                            model.addAttribute("status" ,arr2);





                           return "index";
                       }




                            //-------------------------------------------------------------------------------------------------




                       @PostMapping("/submit")
                       private String DisplayResult (Model model ,Citizens citizens){

                                // fetching all data from db
                            if(citizens.getPlanName().isEmpty() && citizens.getGender().isEmpty() && citizens.getStatus().isEmpty()){

                                List<Citizens> citizensList = citiRepo.findAll();
                                model.addAttribute("dataList", citizensList);


                            } else if (!citizens.getPlanName().isEmpty() &&citizens.getGender().isEmpty() && citizens.getStatus().isEmpty()) {

                                String planName = citizens.getPlanName();

                                List<Citizens> byPlanName = citiRepo.findByPlanName(planName);
                                model.addAttribute("dataList", byPlanName);


                            } else if(!citizens.getPlanName().isEmpty() && !citizens.getGender().isEmpty() && citizens.getStatus().isEmpty()) {

                                List<Citizens> byPlanNameAndGender = citiRepo.findByPlanNameAndGender(citizens.getPlanName() ,citizens.getGender());
                                model.addAttribute("dataList", byPlanNameAndGender);


                            } else if(!citizens.getPlanName().isEmpty() && !citizens.getGender().isEmpty() && !citizens.getStatus().isEmpty()) {
                                List<Citizens> byPlanNameAndGenderAndStatus = citiRepo.findByPlanNameAndGenderAndStatus(citizens.getPlanName(), citizens.getGender(), citizens.getStatus());
                                model.addAttribute("dataList", byPlanNameAndGenderAndStatus);

                            }


                           //----------------------------------------------------------------------------


                                                           Citizens c = new Citizens();

                          // System.out.println("================  Load Plan   =================================");

                           List<PlanName> plan = sc.loadPlan();
                           String str[] = new String[plan.size()];
                           int []count = {0};

                           plan.forEach(e->{
                               str[count[0]] = e.getPlanName();
                               count[0]++;
                           } );

                           ///--------------------------------------------------------------------------------------------------------------------------------

                        //   System.out.println("===============  Status   ===================================");

                           List<status> planNames = sc.loadStatus();
                           String []arr2 = new String[planNames.size()];
                           int []pass = {0};

                           planNames.forEach(e-> {
                               arr2[pass[0]] = e.getPlanStatus();
                               pass[0]++;
                           });

                           //----------------------------------------------------------------------------------------------------------------------------------------

                           model.addAttribute("humans" , c);
                           model.addAttribute("plan" ,str);
                           model.addAttribute("status" ,arr2);

                          // System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Citizen loading <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

                           System.out.println(citizens );

                            return "index";
                       }


}
