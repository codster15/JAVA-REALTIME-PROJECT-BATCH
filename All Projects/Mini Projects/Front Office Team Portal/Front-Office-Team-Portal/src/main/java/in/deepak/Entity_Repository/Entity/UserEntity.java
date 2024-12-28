package in.deepak.Entity_Repository.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer empId;

    private String name;
    private String email;
    private Integer mobile;
    private Integer Password;
    private String accountStatus;


}
