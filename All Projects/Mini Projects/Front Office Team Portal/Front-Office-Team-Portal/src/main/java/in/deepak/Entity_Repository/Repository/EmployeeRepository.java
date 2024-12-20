package in.deepak.Entity_Repository.Repository;

import in.deepak.Entity_Repository.Entity.Employee_Table;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee_Table , Integer>{

}
