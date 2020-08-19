package ua.step.example.solid;

import ua.step.example.solid.model5.D.Imap4Protocol;
import ua.step.example.solid.model5.D.MailProtocol;
import ua.step.example.solid.model5.D.SmtpPotocol;

/**
 * D- инверсия контроля, зависеть надо от абстракций
 */
public class Task06 {
    public static void main(String[] args) {
        Mailer mailer = new Mailer();
        mailer.sendMessage("test message");
    }
}

/**
 * 
 * Класс для отправки почтовых сообщений
 *
 */
class Mailer
{
    MailProtocol smtpPotocol = new SmtpPotocol();
    MailProtocol imap4Protocol = new Imap4Protocol();

    public void sendMessage(String message) {
        imap4Protocol.send(message);
    }
}