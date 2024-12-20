package in.deepak.Entity_Repository.Repository;

import in.deepak.Entity_Repository.Entity.EnquiryStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface enquiryRepository extends JpaRepository<EnquiryStatusEntity, Integer> {
}
