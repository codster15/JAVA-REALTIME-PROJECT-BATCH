package in.deepak.Entity_Repository.Repository;

import in.deepak.Entity_Repository.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
}
