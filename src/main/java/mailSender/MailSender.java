package mailSender;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import lombok.SneakyThrows;


public class MailSender {
    @SneakyThrows
    public static void sendMail(MailInfo mailInfo) {
        Email from = new Email("no-reply@ucu.edu.ua");
        String subject = "Mail from UCU team!";
        Email to = new Email(mailInfo.getEmail());
        Content content = new Content("text/plain", mailInfo.getClientText());
        Mail mail = new Mail(from, subject, to, content);

        SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
        Request request = new Request();
        request.setMethod(Method.POST);
        request.setEndpoint("mail/send");
        request.setBody(mail.build());
        Response response = sg.api(request);
        //System.out.println(response.getStatusCode());
        //System.out.println(response.getBody());
        //System.out.println(response.getHeaders());
        System.out.println("We send a letter for " + mailInfo.getEmail());
    }
}
