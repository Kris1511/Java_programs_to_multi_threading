package OTPAuthentication.serrvice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import OTPAuthentication.entities.MailEntities;
import OTPAuthentication.repository.MailRepository;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class MailServiceImplement implements MailService {
	
	@Autowired
	MailRepository repo;
	
	@Autowired
	JavaMailSender sender;
	
	public void sendEmail(MailEntities mail) {
		
//		String.format("", null, null)
		
		MimeMessage msg = sender.createMimeMessage();
		MimeMessageHelper mmh = new MimeMessageHelper(msg, "utf-8");
		
		try {
			mmh.setTo(mail.getReceiver());
			mmh.setSubject(mail.getSubject());
			mmh.setText(mail.getBody());
			
			repo.save(mail);
			
			sender.send(msg);
		} 
		catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}
