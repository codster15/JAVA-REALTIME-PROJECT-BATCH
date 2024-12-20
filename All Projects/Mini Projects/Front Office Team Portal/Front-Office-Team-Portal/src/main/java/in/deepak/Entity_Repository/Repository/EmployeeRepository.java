package in.deepak.Entity_Repository.Repository;


import in.deepak.Entity_Repository.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <UserEntity , Integer>{

}
