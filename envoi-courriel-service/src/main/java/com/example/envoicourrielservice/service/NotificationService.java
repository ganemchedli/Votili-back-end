package com.example.envoicourrielservice.service;


import com.example.envoicourrielservice.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

	private JavaMailSender javaMailSender;
	@Autowired
	public NotificationService (JavaMailSender javaMailSender)
	{
		this.javaMailSender=javaMailSender;
	}
	public void sendNotification(User user)throws Exception
	{
		SimpleMailMessage mail=new SimpleMailMessage();
		 mail.setTo(user.getEmailAdress());
		 mail.setFrom("ichrakbenhsinne2@gmail.com");
		 mail.setSubject("Surprise");
		 mail.setText("This is a microservice that I created for our application to invite people to vote or participate in specific elections by sending them an email. It look worke very well !! yeyyyyyyy XD.");
		 javaMailSender.send(mail);
	}
	public void sendNotificationWithAttachment(User user)throws Exception {
        MimeMessage msg = javaMailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(msg, true);
        helper.setTo(user.getEmailAdress());
        helper.setFrom("ichrakbenhsinne2@gmail.com");
        helper.setSubject("Surprise");
        helper.setText("You have been invited to participate in this election. Please click on the link below to cast your vote");
        helper.addAttachment("logo.png", new ClassPathResource("logo.png"));
        helper.setText("https:4200//inscriptionelection");
        javaMailSender.send(msg);
    }
}
