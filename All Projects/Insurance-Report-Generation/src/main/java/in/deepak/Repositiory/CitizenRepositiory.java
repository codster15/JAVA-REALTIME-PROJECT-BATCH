package in.deepak.Repositiory;

import in.deepak.Entity.Citizens;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CitizenRepositiory extends JpaRepository<Citizens,Integer> {



    List<Citizens> findByPlanName(String planName);

    List<Citizens> findByPlanNameAndGender(String planName, String gender);

    List<Citizens> findByPlanNameAndGenderAndStatus(String planName, String gender, String status);




}
