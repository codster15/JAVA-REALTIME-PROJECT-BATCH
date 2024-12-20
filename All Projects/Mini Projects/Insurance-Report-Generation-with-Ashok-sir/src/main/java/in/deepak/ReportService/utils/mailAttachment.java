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

    // This method is responsible for sending an email.
// It takes the email subject, body, and recipient's email address as input.
    public boolean mailSender(String subject, String body, String to) throws MessagingException {

        try {
            // Step 1: Create a blank email message using the mailSender.
            MimeMessage mimeMessage = mailSender.createMimeMessage();

            // Step 2: Create a helper object to configure the email message easily.
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);

            // Step 3: Set the subject (title) of the email.
            messageHelper.setSubject(subject);

            // Step 4: Set the body (content) of the email.
            messageHelper.setText(body);

            // Step 5: Set the recipient's email address.
            messageHelper.setTo(to);

            // Step 6: Send the email using the mailSender object.
            mailSender.send(mimeMessage);

        } catch (Exception e) {
            // Step 7: Print the exception details if any error occurs while sending the email.
            e.printStackTrace();
        }

        // Step 8: Return true after execution, regardless of success or failure.
        return true;
    }


}
