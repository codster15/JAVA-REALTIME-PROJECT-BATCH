package in.deepak.Entity_Repository.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Entity
@Data
public class StudentEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer student_id;
    private String name;
    private Integer phoneNo;
    private String classMode;
    private String courseName;
    private String enquiryStatus;
    private Date createdDate;
    private Date updatedDate;

    @ManyToOne
    @JoinColumn(name = "emp_id", referencedColumnName = "emp_id") // emp_id as foreign key
    private UserEntity employee; // The associated Employee entity
}
