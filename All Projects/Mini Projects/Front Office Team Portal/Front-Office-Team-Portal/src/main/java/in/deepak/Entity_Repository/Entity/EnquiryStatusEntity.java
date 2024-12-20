package in.deepak.Entity_Repository.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class EnquiryStatusEntity{

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer enquiry_id;
    private String enquiryStatus;

}
