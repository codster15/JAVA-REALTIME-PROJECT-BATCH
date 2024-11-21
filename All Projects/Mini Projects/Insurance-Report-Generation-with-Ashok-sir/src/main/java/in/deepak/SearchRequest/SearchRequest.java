package in.deepak.SearchRequest;

import lombok.Data;
import java.time.LocalDate;



@Data
public class SearchRequest {

    public String planName;
    public String planStatus;
    public String gender;
    public LocalDate startDate;
    public LocalDate endDate;


}
