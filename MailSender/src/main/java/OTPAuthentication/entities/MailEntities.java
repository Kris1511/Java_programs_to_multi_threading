package OTPAuthentication.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
public class MailEntities {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String receiver;
	String subject;
	String body;
	public MailEntities() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MailEntities(int id, String receiver, String subject, String body) {
		super();
		this.id = id;
		this.receiver = receiver;
		this.subject = subject;
		this.body = body;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "MailEntities [id=" + id + ", receiver=" + receiver + ", subject=" + subject + ", body=" + body + "]";
	}
}
