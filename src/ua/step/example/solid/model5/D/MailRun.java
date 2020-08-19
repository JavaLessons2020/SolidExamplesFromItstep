package ua.step.example.solid.model5.D;

public class MailRun {
    public static void main(String[] args) {
        MailProtocol imap4 = new Imap4Protocol();
        SmtpPotocol smtp = new SmtpPotocol();

        imap4.send("imap");
        smtp.send("smtp");
    }
}
