package in.deepak.ReportService.utils;

import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class mailAttachment {

    @Autowired
    private JavaMailSender mailSender;

    public boolean mailSender(String subject, String body, String to, File file) {
        try {
            // Create a blank email message
            MimeMessage mimeMessage = mailSender.createMimeMessage();

            // Create a helper object to configure the email message
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);

            // Set subject, body, and recipient
            messageHelper.setSubject(subject);
            messageHelper.setText(body);
            messageHelper.setTo(to);

            // Attach file
            if ("Citizen.xls".equals(file.getName())) {
                messageHelper.addAttachment("Citizen.xls", file);
            } else {
                messageHelper.addAttachment("Citizen.pdf", file);
            }

            // Send the email
            mailSender.send(mimeMessage);

            return true;

        } catch (Exception e) {
            // Print the exception details if any error occurs
            e.printStackTrace();
            return false;
        }
    }
}
