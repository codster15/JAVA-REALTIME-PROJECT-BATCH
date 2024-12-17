package in.deepak.ReportService.utils;


import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;

@Controller
public class mailAttachment {

    @Autowired
    private JavaMailSender mailSender;

    public boolean mailSender(String subject , String body , String to ) throws MessagingException {



        try{
                    MimeMessage mimeMessage = mailSender.createMimeMessage();

                    MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);

                            messageHelper.setSubject(subject);
                            messageHelper.setText(body);
                            messageHelper.setTo(to);

                    mailSender.send(mimeMessage);

        }catch(Exception e){

                    e.printStackTrace();
        }


        return true;
    }

}
