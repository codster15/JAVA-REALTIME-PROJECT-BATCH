package in.deepak.Repositiory;

import in.deepak.Entity.Citizens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CitizenRepositiory extends JpaRepository<Citizens,Integer> {


    @Query("select distinct (planName) from CitizenPlan")
    public List<String> getPlannames();
        @Query("select distinct (planStatus) from CitizenPlan")
    public List<String> getPlanStatus();



//    List<Citizens> findByPlanName(String planName);
//
//    List<Citizens> findByPlanNameAndGender(String planName, String gender);
//
//    List<Citizens> findByPlanNameAndGenderAndStatus(String planName, String gender, String status);




}
