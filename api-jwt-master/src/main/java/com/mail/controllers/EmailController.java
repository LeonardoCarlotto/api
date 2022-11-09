package com.mail.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailController {
	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	private SimpleMailMessage message;

	public Boolean sendMail(String Subject, String mensagem, String email) {
		message.setSubject(Subject);
		message.setText(mensagem);
		message.setTo(email);
		message.setFrom("carlotto.mail@gmail.com");

		try {
			mailSender.send(message);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
