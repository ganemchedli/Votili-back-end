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
}
