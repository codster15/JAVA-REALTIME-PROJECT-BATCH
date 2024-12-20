package in.deepak.Entity_Repository.Repository;

import in.deepak.Entity_Repository.Entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseEntity,Integer> {
}
