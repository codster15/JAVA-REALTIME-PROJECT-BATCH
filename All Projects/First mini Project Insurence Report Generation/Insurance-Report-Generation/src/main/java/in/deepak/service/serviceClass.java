package in.deepak.service;


import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class serviceClass {

    public List<String> loadPlan(){
        List<String> list = Arrays.asList("cash", "Food", "Medical", "Employment");
        return list;
    }

    public List<String> loadStatus() {
        return Arrays.asList("Approved" , "Denied" , " Terminated ");
    }


}
