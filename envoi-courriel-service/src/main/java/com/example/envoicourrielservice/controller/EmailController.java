package com.example.envoicourrielservice.controller;

import com.example.envoicourrielservice.models.User;
import com.example.envoicourrielservice.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	@Autowired 
	private NotificationService notificationService;

	@RequestMapping("/Signup")
	public String Signup()
	{
		return "Signup please for our Service";
	}
	@RequestMapping("/Signup-sucess")
	public String signupSucess() {
		User user=new User();
		user.setFirstname("ganem");
		user.setLastName("chedli");
		user.setEmailAdress("ganem.chedli@etudiant-enit.utm.tn");
		try
		{
			notificationService.sendNotification(user);
		}
	 catch (Exception e) {
			
			e.printStackTrace();
		}
	  return "Thank you for registration with us";
	}
}
