package in.deepak.CitizenRepo;

import in.deepak.Entity.citizenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitizenRepositiory extends JpaRepository<citizenEntity, Integer> {


    @Query(value = "SELECT DISTINCT (planName) FROM citizenEntity")
    public List<String> LoadPlan ();

    @Query(value = "SELECT DISTINCT (planStatus) FROM citizenEntity")
    public List<String> LoadStatus ();

}