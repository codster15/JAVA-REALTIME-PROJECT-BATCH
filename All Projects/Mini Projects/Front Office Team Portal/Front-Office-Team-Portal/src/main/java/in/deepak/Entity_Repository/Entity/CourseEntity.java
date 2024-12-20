package in.deepak.Entity_Repository.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class CourseEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer course_id;

    private String course;
}
