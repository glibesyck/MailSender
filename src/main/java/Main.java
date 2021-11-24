import mailSender.*;

public class Main {
    public static void main(String[] args) {
        Client firstClient = new Client("Someone", "18", Gender.MALE, "someone@ucu.edu.ua");
        MailInfo mailInfo = new MailInfo(firstClient, MailCode.HAPPY_BIRTHDAY);
        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(mailInfo);
        System.out.println(mailInfo.getClientText());
        mailBox.sendAll();
    }
}
