package emailService;


import pk1.template.CreateQuickRegisterEmail;


import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

/**
 * Created by MILA on 3/6/2017.
 */
public class EmailService implements IEmailService {


    @Override
    public void sendSSL(EmailNotification emailNotification) {
        try {
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", 465);
            props.put("mail.smtp.socketFactory.class",
                    "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", 465);
            props.put("mail.smtp.ssl.enable", "true");

            Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication("info@ntex.vn", "NTex@0106");
                        }
                    });
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("info@ntex.vn","DBS"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailNotification.getEmail()));
            message.setContent(emailNotification.getMessage(), "text/html; charset=utf-8");
            message.setSubject(emailNotification.getSubject());
            //attach file
            Multipart multipart = new MimeMultipart();
            BodyPart messageBodyPart = new MimeBodyPart();
            String filename = "C:\\Users\\DoanNH\\IdeaProjects\\DemoItext\\DemoItext\\src\\main\\resources\\htmlFile\\result.pdf";
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename);
            multipart.addBodyPart(messageBodyPart);
            messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent(emailNotification.getMessage(), "text/html; charset=utf-8");
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            //
            Transport.send(message);
        } catch (UnsupportedEncodingException ex) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sendEmail() {
        try {
            EmailNotification emailNotification = new EmailNotification();
            emailNotification.setEmail("doannh@ntex.vn");
            String emailBody = new CreateQuickRegisterEmail("hello", "doannh@ntex.vn").render();
            emailNotification.setSubject("Create your BankTek account");
            emailNotification.setMessage(emailBody);
            sendSSL(emailNotification);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
