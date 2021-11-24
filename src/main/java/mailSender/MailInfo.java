package mailSender;

import java.util.HashMap;

public class MailInfo {
    private Client client;
    private MailCode mailCode;
    public MailInfo(Client client, MailCode mailCode) {
        this.client = client;
        this.mailCode = mailCode;
    }
    public String getClientText() {
        String text = mailCode.generateText();
        HashMap <String, String> clientInfo = new HashMap<>();
        clientInfo.put("%NAME%", client.getName());
        clientInfo.put("%AGE%", client.getAge());
        for (String key: clientInfo.keySet()) {
            text = text.replace(key, clientInfo.get(key));
        };
        return text;
    }
    public String getEmail() {
        return client.getEmail();
    }
}
