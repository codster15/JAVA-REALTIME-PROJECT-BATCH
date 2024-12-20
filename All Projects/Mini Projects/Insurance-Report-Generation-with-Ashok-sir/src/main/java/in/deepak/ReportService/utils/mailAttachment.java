package in.deepak.ReportService.utils;


import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;

import java.io.File;

@Controller
public class mailAttachment {

    @Autowired
    private JavaMailSender mailSender;

    public boolean mailSender(String subject , String body , String to , File file  ) throws MessagingException {



        try{
                    MimeMessage mimeMessage = mailSender.createMimeMessage();

                    MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage , true);

                            messageHelper.setSubject(subject);
                            messageHelper.setText(body);
                            messageHelper.setTo(to);

            System.out.println(  file.getName());

                        if (file.getName() == "Citizen.xls"){
                            messageHelper.addAttachment("Citizen.xls" , file);
                        }else{
                            messageHelper.addAttachment("Citizen.pdf" , file);
                        }


                    mailSender.send(mimeMessage);

        }catch(Exception e){

                    e.printStackTrace();
        }


        return true;
    }

}
