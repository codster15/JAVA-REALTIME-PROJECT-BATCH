package in.deepak.Runner;

import in.deepak.CitizenRepo.CitizenRepositiory;

import in.deepak.Entity.citizenEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;

@Component
public class LoadDataRunner implements ApplicationRunner {


    @Autowired
    public CitizenRepositiory citiRepo;

            @Override
            public void run(ApplicationArguments args) throws Exception {

                citiRepo.deleteAll();

                // cash plan
                citizenEntity c1 = new citizenEntity();
                c1.setName("joship");
                c1.setGender("Male");
                c1.setPlanName("Cash");
                c1.setPlanStatus("Approved");
                c1.setStartDate(LocalDate.now());
                c1.setEndDate(LocalDate.now().plusMonths(6));
                c1.setBenefitAmount(5000);


                            //denied
                citizenEntity c2 = new citizenEntity();
                c2.setName("Anjela");
                c2.setGender("Female");
                c2.setPlanName("Cash");
                c2.setPlanStatus("Denied");
                c2.setDenialReason("Salaried");

                            //Terminated
                citizenEntity c3 = new citizenEntity();
                c3.setName("John");
                c3.setGender("Male");
                c3.setPlanName("Cash");
                c3.setPlanStatus("Terminated");
                c3.setStartDate(LocalDate.now().minusMonths(4));
                c3.setEndDate(LocalDate.now().plusMonths(6));
                c3.setTerminatedDate(LocalDate.now());
                c3.setTerminatedReason("Employed from last few months");


                //================================================================

                //food Plan Data
                citizenEntity c4 = new citizenEntity();
                c4.setName("joship");
                c4.setGender("Male");
                c4.setPlanName("Food");
                c4.setPlanStatus("Approved");
                c4.setStartDate(LocalDate.now());
                c4.setEndDate(LocalDate.now().plusMonths(6));
                c4.setBenefitAmount(6000);

                                //denied
                citizenEntity c5 = new citizenEntity();
                c5.setName("Adam");
                c5.setGender("Male");
                c5.setPlanName("food");
                c5.setPlanStatus("Denied");
                c5.setDenialReason("Property");

                                //Terminated
                citizenEntity c6 = new citizenEntity();
                c6.setName("Wilson");
                c6.setGender("Male");
                c6.setPlanName("Food");
                c6.setPlanStatus("Terminated");
                c6.setStartDate(LocalDate.now().minusMonths(5));
                c6.setEndDate(LocalDate.now().plusMonths(7));
                c6.setTerminatedDate(LocalDate.now());
                c6.setTerminatedReason("Working in different Company");


                //==============================================================================

                // Medical plan Data
                citizenEntity c7 = new citizenEntity();
                c7.setName("Jessica");
                c7.setGender("Female");
                c7.setPlanName("Medical");
                c7.setPlanStatus("Approved");
                c7.setStartDate(LocalDate.now());
                c7.setEndDate(LocalDate.now().plusMonths(6));
                c7.setBenefitAmount(7000);

                                //denied
                citizenEntity c8 = new citizenEntity();
                c8.setName("Smith");
                c8.setGender("Male");
                c8.setPlanName("Medical");
                c8.setPlanStatus("Denied");
                c8.setDenialReason("Enough Property");

                                //Terminated
                citizenEntity c9 = new citizenEntity();
                c9.setName("Johnson");
                c9.setGender("Male");
                c9.setPlanName("Medical");
                c9.setPlanStatus("Terminated");
                c9.setStartDate(LocalDate.now().minusMonths(1));
                c9.setEndDate(LocalDate.now().plusMonths(5));
                c9.setTerminatedDate(LocalDate.now());
                c9.setTerminatedReason("Due to misbehave");

                // ==========================================================================

                // Employment Plan Data

                citizenEntity c10 = new citizenEntity();
                c10.setName("Alexa");
                c10.setGender("Female");
                c10.setPlanName("Employment");
                c10.setPlanStatus("Approved");
                c10.setStartDate(LocalDate.now());
                c10.setEndDate(LocalDate.now().plusMonths(6));
                c10.setBenefitAmount(8000);

                                 //denied
                citizenEntity c11 = new citizenEntity();
                c11.setName("Zack");
                c11.setGender("Male");
                c11.setPlanName("Employment");
                c11.setPlanStatus("Denied");
                c11.setDenialReason("Not Eligible");

                                //Terminated
                citizenEntity c12 = new citizenEntity();
                c12.setName("Orlen");
                c12.setGender("Male");
                c12.setPlanName("Employment");
                c12.setPlanStatus("Terminated");
                c12.setStartDate(LocalDate.now().minusMonths(2));
                c12.setEndDate(LocalDate.now().plusMonths(8));
                c12.setTerminatedDate(LocalDate.now());
                c12.setTerminatedReason("Left the job");


                citiRepo.saveAll(Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12));

            }



}
