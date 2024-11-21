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

        // Cash plan data
        citizenEntity c1 = new citizenEntity();
        c1.setName("Joship");
        c1.setGender("Male");
        c1.setPlanName("Cash");
        c1.setPlanStatus("Approved");
        c1.setStartDate(LocalDate.now());
        c1.setEndDate(LocalDate.now().plusMonths(6));
        c1.setBenefitAmount(5000);

        citizenEntity c2 = new citizenEntity();
        c2.setName("Anjela");
        c2.setGender("Female");
        c2.setPlanName("Cash");
        c2.setPlanStatus("Denied");
        c2.setDenialReason("Salaried");

        citizenEntity c3 = new citizenEntity();
        c3.setName("John");
        c3.setGender("Male");
        c3.setPlanName("Cash");
        c3.setPlanStatus("Terminated");
        c3.setStartDate(LocalDate.now().minusMonths(4));
        c3.setEndDate(LocalDate.now().plusMonths(6));
        c3.setTerminatedDate(LocalDate.now());
        c3.setTerminatedReason("Employed from last few months");

        // Food plan data
        citizenEntity c4 = new citizenEntity();
        c4.setName("Joship");
        c4.setGender("Male");
        c4.setPlanName("Food");
        c4.setPlanStatus("Approved");
        c4.setStartDate(LocalDate.now());
        c4.setEndDate(LocalDate.now().plusMonths(6));
        c4.setBenefitAmount(6000);

        citizenEntity c5 = new citizenEntity();
        c5.setName("Adam");
        c5.setGender("Male");
        c5.setPlanName("Food");
        c5.setPlanStatus("Denied");
        c5.setDenialReason("Property");

        citizenEntity c6 = new citizenEntity();
        c6.setName("Wilson");
        c6.setGender("Male");
        c6.setPlanName("Food");
        c6.setPlanStatus("Terminated");
        c6.setStartDate(LocalDate.now().minusMonths(5));
        c6.setEndDate(LocalDate.now().plusMonths(7));
        c6.setTerminatedDate(LocalDate.now());
        c6.setTerminatedReason("Working in different Company");

        // Medical plan data
        citizenEntity c7 = new citizenEntity();
        c7.setName("Jessica");
        c7.setGender("Female");
        c7.setPlanName("Medical");
        c7.setPlanStatus("Approved");
        c7.setStartDate(LocalDate.now());
        c7.setEndDate(LocalDate.now().plusMonths(6));
        c7.setBenefitAmount(7000);

        citizenEntity c8 = new citizenEntity();
        c8.setName("Smith");
        c8.setGender("Male");
        c8.setPlanName("Medical");
        c8.setPlanStatus("Denied");
        c8.setDenialReason("Enough Property");

        citizenEntity c9 = new citizenEntity();
        c9.setName("Johnson");
        c9.setGender("Male");
        c9.setPlanName("Medical");
        c9.setPlanStatus("Terminated");
        c9.setStartDate(LocalDate.now().minusMonths(1));
        c9.setEndDate(LocalDate.now().plusMonths(5));
        c9.setTerminatedDate(LocalDate.now());
        c9.setTerminatedReason("Due to misbehave");

        // Employment plan data
        citizenEntity c10 = new citizenEntity();
        c10.setName("Alexa");
        c10.setGender("Female");
        c10.setPlanName("Employment");
        c10.setPlanStatus("Approved");
        c10.setStartDate(LocalDate.now());
        c10.setEndDate(LocalDate.now().plusMonths(6));
        c10.setBenefitAmount(8000);

        citizenEntity c11 = new citizenEntity();
        c11.setName("Zack");
        c11.setGender("Male");
        c11.setPlanName("Employment");
        c11.setPlanStatus("Denied");
        c11.setDenialReason("Not Eligible");

        citizenEntity c12 = new citizenEntity();
        c12.setName("Orlen");
        c12.setGender("Male");
        c12.setPlanName("Employment");
        c12.setPlanStatus("Terminated");
        c12.setStartDate(LocalDate.now().minusMonths(2));
        c12.setEndDate(LocalDate.now().plusMonths(8));
        c12.setTerminatedDate(LocalDate.now());
        c12.setTerminatedReason("Left the job");

        // Add more records similarly...

        citizenEntity c13 = new citizenEntity();
        c13.setName("Sophia");
        c13.setGender("Female");
        c13.setPlanName("Cash");
        c13.setPlanStatus("Approved");
        c13.setStartDate(LocalDate.now());
        c13.setEndDate(LocalDate.now().plusMonths(6));
        c13.setBenefitAmount(4500);

        citizenEntity c14 = new citizenEntity();
        c14.setName("Liam");
        c14.setGender("Male");
        c14.setPlanName("Cash");
        c14.setPlanStatus("Denied");
        c14.setDenialReason("Income too high");

        citizenEntity c15 = new citizenEntity();
        c15.setName("Olivia");
        c15.setGender("Female");
        c15.setPlanName("Cash");
        c15.setPlanStatus("Terminated");
        c15.setStartDate(LocalDate.now().minusMonths(3));
        c15.setEndDate(LocalDate.now().plusMonths(5));
        c15.setTerminatedDate(LocalDate.now());
        c15.setTerminatedReason("Opted for another plan");

        citizenEntity c16 = new citizenEntity();
        c16.setName("Mason");
        c16.setGender("Male");
        c16.setPlanName("Food");
        c16.setPlanStatus("Approved");
        c16.setStartDate(LocalDate.now());
        c16.setEndDate(LocalDate.now().plusMonths(6));
        c16.setBenefitAmount(7000);

        citizenEntity c17 = new citizenEntity();
        c17.setName("Isabella");
        c17.setGender("Female");
        c17.setPlanName("Food");
        c17.setPlanStatus("Denied");
        c17.setDenialReason("Non-residence status");

        citizenEntity c18 = new citizenEntity();
        c18.setName("Elijah");
        c18.setGender("Male");
        c18.setPlanName("Food");
        c18.setPlanStatus("Terminated");
        c18.setStartDate(LocalDate.now().minusMonths(6));
        c18.setEndDate(LocalDate.now().plusMonths(7));
        c18.setTerminatedDate(LocalDate.now());
        c18.setTerminatedReason("Change in job");

        citizenEntity c19 = new citizenEntity();
        c19.setName("Charlotte");
        c19.setGender("Female");
        c19.setPlanName("Medical");
        c19.setPlanStatus("Approved");
        c19.setStartDate(LocalDate.now());
        c19.setEndDate(LocalDate.now().plusMonths(6));
        c19.setBenefitAmount(8000);

        citizenEntity c20 = new citizenEntity();
        c20.setName("Amelia");
        c20.setGender("Female");
        c20.setPlanName("Medical");
        c20.setPlanStatus("Denied");
        c20.setDenialReason("Medical history issues");

        citizenEntity c21 = new citizenEntity();
        c21.setName("James");
        c21.setGender("Male");
        c21.setPlanName("Medical");
        c21.setPlanStatus("Terminated");
        c21.setStartDate(LocalDate.now().minusMonths(2));
        c21.setEndDate(LocalDate.now().plusMonths(6));
        c21.setTerminatedDate(LocalDate.now());
        c21.setTerminatedReason("Moving abroad");

        citizenEntity c22 = new citizenEntity();
        c22.setName("Benjamin");
        c22.setGender("Male");
        c22.setPlanName("Employment");
        c22.setPlanStatus("Approved");
        c22.setStartDate(LocalDate.now());
        c22.setEndDate(LocalDate.now().plusMonths(6));
        c22.setBenefitAmount(9000);

        citizenEntity c23 = new citizenEntity();
        c23.setName("Amos");
        c23.setGender("Male");
        c23.setPlanName("Employment");
        c23.setPlanStatus("Denied");
        c23.setDenialReason("Not enough work experience");

        citizenEntity c24 = new citizenEntity();
        c24.setName("Evelyn");
        c24.setGender("Female");
        c24.setPlanName("Employment");
        c24.setPlanStatus("Terminated");
        c24.setStartDate(LocalDate.now().minusMonths(1));
        c24.setEndDate(LocalDate.now().plusMonths(4));
        c24.setTerminatedDate(LocalDate.now());
        c24.setTerminatedReason("Resigned from the job");

        citizenEntity c25 = new citizenEntity();
        c25.setName("Hannah");
        c25.setGender("Female");
        c25.setPlanName("Cash");
        c25.setPlanStatus("Approved");
        c25.setStartDate(LocalDate.now());
        c25.setEndDate(LocalDate.now().plusMonths(6));
        c25.setBenefitAmount(5500);

        citizenEntity c26 = new citizenEntity();
        c26.setName("Luke");
        c26.setGender("Male");
        c26.setPlanName("Food");
        c26.setPlanStatus("Approved");
        c26.setStartDate(LocalDate.now());
        c26.setEndDate(LocalDate.now().plusMonths(6));
        c26.setBenefitAmount(6500);

        citizenEntity c27 = new citizenEntity();
        c27.setName("Mila");
        c27.setGender("Female");
        c27.setPlanName("Food");
        c27.setPlanStatus("Denied");
        c27.setDenialReason("Overseas resident");

        citizenEntity c28 = new citizenEntity();
        c28.setName("Oliver");
        c28.setGender("Male");
        c28.setPlanName("Medical");
        c28.setPlanStatus("Approved");
        c28.setStartDate(LocalDate.now());
        c28.setEndDate(LocalDate.now().plusMonths(6));
        c28.setBenefitAmount(7500);

        citizenEntity c29 = new citizenEntity();
        c29.setName("Sophia");
        c29.setGender("Female");
        c29.setPlanName("Employment");
        c29.setPlanStatus("Terminated");
        c29.setStartDate(LocalDate.now().minusMonths(3));
        c29.setEndDate(LocalDate.now().plusMonths(8));
        c29.setTerminatedDate(LocalDate.now());
        c29.setTerminatedReason("Job change");

        citizenEntity c30 = new citizenEntity();
        c30.setName("Ethan");
        c30.setGender("Male");
        c30.setPlanName("Cash");
        c30.setPlanStatus("Denied");
        c30.setDenialReason("High income");

        citizenEntity c31 = new citizenEntity();
        c31.setName("Grace");
        c31.setGender("Female");
        c31.setPlanName("Cash");
        c31.setPlanStatus("Terminated");
        c31.setStartDate(LocalDate.now().minusMonths(2));
        c31.setEndDate(LocalDate.now().plusMonths(4));
        c31.setTerminatedDate(LocalDate.now());
        c31.setTerminatedReason("Self-employed");

        citizenEntity c32 = new citizenEntity();
        c32.setName("Jack");
        c32.setGender("Male");
        c32.setPlanName("Food");
        c32.setPlanStatus("Approved");
        c32.setStartDate(LocalDate.now());
        c32.setEndDate(LocalDate.now().plusMonths(6));
        c32.setBenefitAmount(6000);

        citizenEntity c33 = new citizenEntity();
        c33.setName("Lily");
        c33.setGender("Female");
        c33.setPlanName("Medical");
        c33.setPlanStatus("Approved");
        c33.setStartDate(LocalDate.now());
        c33.setEndDate(LocalDate.now().plusMonths(6));
        c33.setBenefitAmount(7000);

        citizenEntity c34 = new citizenEntity();
        c34.setName("Daniel");
        c34.setGender("Male");
        c34.setPlanName("Employment");
        c34.setPlanStatus("Denied");
        c34.setDenialReason("Not a citizen");

        citizenEntity c35 = new citizenEntity();
        c35.setName("Henry");
        c35.setGender("Male");
        c35.setPlanName("Medical");
        c35.setPlanStatus("Terminated");
        c35.setStartDate(LocalDate.now().minusMonths(2));
        c35.setEndDate(LocalDate.now().plusMonths(5));
        c35.setTerminatedDate(LocalDate.now());
        c35.setTerminatedReason("Misuse of benefits");

        citizenEntity c36 = new citizenEntity();
        c36.setName("Chloe");
        c36.setGender("Female");
        c36.setPlanName("Employment");
        c36.setPlanStatus("Approved");
        c36.setStartDate(LocalDate.now());
        c36.setEndDate(LocalDate.now().plusMonths(6));
        c36.setBenefitAmount(8500);


        citizenEntity c37 = new citizenEntity();
        c37.setName("Aiden");
        c37.setGender("Male");
        c37.setPlanName("Cash");
        c37.setPlanStatus("Approved");
        c37.setStartDate(LocalDate.now());
        c37.setEndDate(LocalDate.now().plusMonths(6));
        c37.setBenefitAmount(5500);

        citizenEntity c38 = new citizenEntity();
        c38.setName("Zoe");
        c38.setGender("Female");
        c38.setPlanName("Cash");
        c38.setPlanStatus("Denied");
        c38.setDenialReason("Exceeds income limit");

        citizenEntity c39 = new citizenEntity();
        c39.setName("Lucas");
        c39.setGender("Male");
        c39.setPlanName("Cash");
        c39.setPlanStatus("Terminated");
        c39.setStartDate(LocalDate.now().minusMonths(4));
        c39.setEndDate(LocalDate.now().plusMonths(6));
        c39.setTerminatedDate(LocalDate.now());
        c39.setTerminatedReason("Discontinued plan");

        citizenEntity c40 = new citizenEntity();
        c40.setName("Maya");
        c40.setGender("Female");
        c40.setPlanName("Food");
        c40.setPlanStatus("Approved");
        c40.setStartDate(LocalDate.now());
        c40.setEndDate(LocalDate.now().plusMonths(6));
        c40.setBenefitAmount(8000);

        citizenEntity c41 = new citizenEntity();
        c41.setName("Ethan");
        c41.setGender("Male");
        c41.setPlanName("Food");
        c41.setPlanStatus("Denied");
        c41.setDenialReason("Out of area");

        citizenEntity c42 = new citizenEntity();
        c42.setName("Madison");
        c42.setGender("Female");
        c42.setPlanName("Food");
        c42.setPlanStatus("Terminated");
        c42.setStartDate(LocalDate.now().minusMonths(5));
        c42.setEndDate(LocalDate.now().plusMonths(7));
        c42.setTerminatedDate(LocalDate.now());
        c42.setTerminatedReason("Moved to another location");

        citizenEntity c43 = new citizenEntity();
        c43.setName("Liam");
        c43.setGender("Male");
        c43.setPlanName("Medical");
        c43.setPlanStatus("Approved");
        c43.setStartDate(LocalDate.now());
        c43.setEndDate(LocalDate.now().plusMonths(6));
        c43.setBenefitAmount(9000);

        citizenEntity c44 = new citizenEntity();
        c44.setName("Charlotte");
        c44.setGender("Female");
        c44.setPlanName("Medical");
        c44.setPlanStatus("Denied");
        c44.setDenialReason("Not eligible due to age");

        citizenEntity c45 = new citizenEntity();
        c45.setName("Oliver");
        c45.setGender("Male");
        c45.setPlanName("Medical");
        c45.setPlanStatus("Terminated");
        c45.setStartDate(LocalDate.now().minusMonths(1));
        c45.setEndDate(LocalDate.now().plusMonths(6));
        c45.setTerminatedDate(LocalDate.now());
        c45.setTerminatedReason("No longer needed");

        citizenEntity c46 = new citizenEntity();
        c46.setName("Nina");
        c46.setGender("Female");
        c46.setPlanName("Employment");
        c46.setPlanStatus("Approved");
        c46.setStartDate(LocalDate.now());
        c46.setEndDate(LocalDate.now().plusMonths(6));
        c46.setBenefitAmount(10000);

        citizenEntity c47 = new citizenEntity();
        c47.setName("Benjamin");
        c47.setGender("Male");
        c47.setPlanName("Employment");
        c47.setPlanStatus("Denied");
        c47.setDenialReason("Not working full-time");

        citizenEntity c48 = new citizenEntity();
        c48.setName("Amelia");
        c48.setGender("Female");
        c48.setPlanName("Employment");
        c48.setPlanStatus("Terminated");
        c48.setStartDate(LocalDate.now().minusMonths(2));
        c48.setEndDate(LocalDate.now().plusMonths(5));
        c48.setTerminatedDate(LocalDate.now());
        c48.setTerminatedReason("Quit the job");

        citizenEntity c49 = new citizenEntity();
        c49.setName("Grace");
        c49.setGender("Female");
        c49.setPlanName("Cash");
        c49.setPlanStatus("Approved");
        c49.setStartDate(LocalDate.now());
        c49.setEndDate(LocalDate.now().plusMonths(6));
        c49.setBenefitAmount(7500);

        citizenEntity c50 = new citizenEntity();
        c50.setName("Daniel");
        c50.setGender("Male");
        c50.setPlanName("Food");
        c50.setPlanStatus("Approved");
        c50.setStartDate(LocalDate.now());
        c50.setEndDate(LocalDate.now().plusMonths(6));
        c50.setBenefitAmount(7000);

        citizenEntity c51 = new citizenEntity();
        c51.setName("Samantha");
        c51.setGender("Female");
        c51.setPlanName("Food");
        c51.setPlanStatus("Denied");
        c51.setDenialReason("Not qualifying for food assistance");

        citizenEntity c52 = new citizenEntity();
        c52.setName("William");
        c52.setGender("Male");
        c52.setPlanName("Medical");
        c52.setPlanStatus("Approved");
        c52.setStartDate(LocalDate.now());
        c52.setEndDate(LocalDate.now().plusMonths(6));
        c52.setBenefitAmount(9500);

        citizenEntity c53 = new citizenEntity();
        c53.setName("Carter");
        c53.setGender("Male");
        c53.setPlanName("Employment");
        c53.setPlanStatus("Denied");
        c53.setDenialReason("Not a registered employee");

        citizenEntity c54 = new citizenEntity();
        c54.setName("Sophia");
        c54.setGender("Female");
        c54.setPlanName("Employment");
        c54.setPlanStatus("Terminated");
        c54.setStartDate(LocalDate.now().minusMonths(3));
        c54.setEndDate(LocalDate.now().plusMonths(6));
        c54.setTerminatedDate(LocalDate.now());
        c54.setTerminatedReason("Job ended");

        citizenEntity c55 = new citizenEntity();
        c55.setName("Jack");
        c55.setGender("Male");
        c55.setPlanName("Cash");
        c55.setPlanStatus("Approved");
        c55.setStartDate(LocalDate.now());
        c55.setEndDate(LocalDate.now().plusMonths(6));
        c55.setBenefitAmount(8500);

        citizenEntity c56 = new citizenEntity();
        c56.setName("Alice");
        c56.setGender("Female");
        c56.setPlanName("Cash");
        c56.setPlanStatus("Denied");
        c56.setDenialReason("Ineligible for cash benefits");

        citizenEntity c57 = new citizenEntity();
        c57.setName("Owen");
        c57.setGender("Male");
        c57.setPlanName("Medical");
        c57.setPlanStatus("Terminated");
        c57.setStartDate(LocalDate.now().minusMonths(3));
        c57.setEndDate(LocalDate.now().plusMonths(5));
        c57.setTerminatedDate(LocalDate.now());
        c57.setTerminatedReason("Transferred to another plan");

        citizenEntity c58 = new citizenEntity();
        c58.setName("Ella");
        c58.setGender("Female");
        c58.setPlanName("Food");
        c58.setPlanStatus("Approved");
        c58.setStartDate(LocalDate.now());
        c58.setEndDate(LocalDate.now().plusMonths(6));
        c58.setBenefitAmount(7800);





        // Save all records
        citiRepo.saveAll(Arrays.asList(
                c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12 ,c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24,
                c25, c26, c27, c28, c29, c30, c31, c32, c33, c34, c35, c36 ,c37, c38, c39, c40, c41, c42, c43, c44, c45, c46, c47, c48,
                c49, c50, c51, c52, c53, c54, c55, c56, c57, c58
                // Add up to 50 records here
        ));
    }
}
