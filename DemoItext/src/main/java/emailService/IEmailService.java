package emailService;


/**
 * Created by MILA on 3/6/2017.
 */
public interface IEmailService {

    void sendSSL(EmailNotification emailNotification);

    void sendEmail();

}
