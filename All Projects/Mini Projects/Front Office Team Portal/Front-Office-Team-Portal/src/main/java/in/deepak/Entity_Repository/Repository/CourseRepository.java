package in.deepak.Entity_Repository.Repository;

import in.deepak.Entity_Repository.Entity.Enquiry_Table;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Enquiry_Table,Integer> {
}
