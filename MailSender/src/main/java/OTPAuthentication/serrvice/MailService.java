package OTPAuthentication.serrvice;

import OTPAuthentication.entities.MailEntities;

public interface MailService {
	
	public void sendEmail(MailEntities mail);

}
