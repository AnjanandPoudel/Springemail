package com.apcodes.SpringEmail;

import org.springframework.beans.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringEmailApplication {

	@Autowired
	private EmailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		senderService.sendEmail("lastfirstqwertyuiop6@gmail.com", "subject", "body");
	}


	/* instead of lastfirstqwertyuiop6@gmail.com , write the receipeint email and instead of subject and body write the actual subject and body */

}
