package ua.step.example.solid.model5.D;

public class SmtpPotocol implements MailProtocol {
	private String name = "SMTP";
	public void send(String message){
		System.out.printf("Send by %s: %s%n", name ,message);
	}
}
