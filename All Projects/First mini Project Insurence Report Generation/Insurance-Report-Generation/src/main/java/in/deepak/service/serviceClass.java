package in.deepak.service;


import in.deepak.Entity.PlanName;
import in.deepak.Entity.status;
import in.deepak.Repositiory.planName;
import in.deepak.Repositiory.statusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class serviceClass {


    @Autowired
    private statusRepo statusRepo;

    @Autowired
    private planName planname;


                                //to load the data from the database
                                public List<status> loadPlan(){
                                    List<status> all = statusRepo.findAll();
                                    return all;
                                }



                            //------------------------------------------------------------------------------



                                // to load the status from the database
                                public List<PlanName> loadStatus() {
                                    List<PlanName> all = planname.findAll();
                                    return all;
                                }


}
