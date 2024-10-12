
package in.deepak.ExceptionHandle;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class ExceptionHandle {

    private Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    public String ExceptionOccur (Exception e){
        String message = e.getMessage();
        logger.error(message);
        return "Error";
    }
}
