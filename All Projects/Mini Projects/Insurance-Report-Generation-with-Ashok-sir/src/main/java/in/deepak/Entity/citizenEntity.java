package in.deepak.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class citizenEntity {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String gender;
    private String planName;
    private String planStatus;
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer benefitAmount;
    private String denialReason;
    private String terminatedReason;
    private LocalDate terminatedDate;

}
