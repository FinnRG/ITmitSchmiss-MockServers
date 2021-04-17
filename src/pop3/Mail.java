package pop3;

import java.util.Date;

public class Mail {
    private final String sender;
    private final String recipient;
    private final String title;
    private final String content;
    private final Date sent;

    public Mail(String sender, String recipient, String title, String content, Date sent) {
        this.sender = sender; this.recipient = recipient; this.title = title; this.content = content; this.sent = sent;
    }

    @Override
    public String toString() {
        return title;
    }

    public String toHTML() {
        return String.format("<HTML><b>From:</b> %s<br><b>To:</b> %s<br><b>Subject:</b> %s<br><br>%s</HTML>", sender, recipient, title, content);
    }
}
