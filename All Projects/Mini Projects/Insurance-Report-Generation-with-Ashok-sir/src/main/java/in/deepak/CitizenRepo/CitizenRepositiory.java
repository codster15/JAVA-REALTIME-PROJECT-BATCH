package in.deepak.CitizenRepo;

import in.deepak.Entity.citizenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenRepositiory extends JpaRepository<citizenEntity, Integer> {

}
