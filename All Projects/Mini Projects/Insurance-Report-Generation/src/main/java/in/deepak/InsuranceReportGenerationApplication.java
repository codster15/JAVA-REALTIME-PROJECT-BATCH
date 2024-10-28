package in.deepak;

import in.deepak.Repositiory.planName;
import in.deepak.Repositiory.statusRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class InsuranceReportGenerationApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext run = SpringApplication.run(InsuranceReportGenerationApplication.class, args);


		statusRepo status = run.getBean(statusRepo.class);

		planName planName = run.getBean(planName.class);




//		CitizenRepositiory bean = run.getBean(CitizenRepositiory.class);

//		List<Citizens> records = Arrays.asList(
//				createCitizen("Cash", "Approved", "Male"),
//				createCitizen("Cash", "Approved", "Female"),
//				createCitizen("Cash", "Denied", "Male"),
//				createCitizen("Cash", "Denied", "Female"),
//				createCitizen("Cash", "Terminated", "Male"),
//				createCitizen("Cash", "Terminated", "Female"),
//				createCitizen("Food", "Approved", "Male"),
//				createCitizen("Food", "Approved", "Female"),
//				createCitizen("Food", "Denied", "Male"),
//				createCitizen("Food", "Denied", "Female"),
//				createCitizen("Food", "Terminated", "Male"),
//				createCitizen("Food", "Terminated", "Female"),
//				createCitizen("Medical", "Approved", "Male"),
//				createCitizen("Medical", "Approved", "Female"),
//				createCitizen("Medical", "Denied", "Male"),
//				createCitizen("Medical", "Denied", "Female"),
//				createCitizen("Medical", "Terminated", "Male"),
//				createCitizen("Medical", "Terminated", "Female"),
//				createCitizen("Employment", "Approved", "Male"),
//				createCitizen("Employment", "Approved", "Female"),
//				createCitizen("Employment", "Denied", "Male"),
//				createCitizen("Employment", "Denied", "Female"),
//				createCitizen("Employment", "Terminated", "Male"),
//				createCitizen("Employment", "Terminated", "Female"),
//				createCitizen("Cash", "Approved", "Male"),
//				createCitizen("Food", "Approved", "Male"),
//				createCitizen("Medical", "Approved", "Male"),
//				createCitizen("Employment", "Approved", "Male"),
//				createCitizen("Cash", "Terminated", "Female"),
//				createCitizen("Food", "Terminated", "Female")
//		);
//
//		bean.saveAll(records);
//
//		System.out.println("====================================================== 			  Data Inserted            ====================");
//
//	}
//
//	private static Citizens createCitizen(String plan, String status, String gender) {
//
//		Citizens c = new Citizens();
//		c.setPlanName(plan);
//		c.setStatus(status);
//		c.setGender(gender);
//        return c;
//    }
	}

}
