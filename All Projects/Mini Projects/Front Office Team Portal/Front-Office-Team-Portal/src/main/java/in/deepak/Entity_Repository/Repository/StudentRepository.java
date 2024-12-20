package in.deepak.Entity_Repository.Repository;

import in.deepak.Entity_Repository.Entity.Student_Table;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student_Table , Integer> {
}
