package in.deepak.Entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class citizenEntity {

    @Id
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
