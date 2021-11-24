package mailSender;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class MailBox {
    private List<MailInfo> infos = new ArrayList<>();
    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }
    public void sendAll() {
        for (MailInfo mailInfo: infos) {
            MailSender.sendMail(mailInfo);
        }
    }
}
