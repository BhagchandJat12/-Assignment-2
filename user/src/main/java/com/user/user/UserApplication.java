package com.user.user;

import com.user.user.Entity.User;
import com.user.user.Entity.UserRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
	   ApplicationContext context=	SpringApplication.run(UserApplication.class, args);
	   UserRepository repository=context.getBean(UserRepository.class);
	   //create object
       User user=new User();
	   //use methods of user
	   user.setName("Tanisha");
	   user.setGender("Female");
	   user.setEmai("tanisha34@gmail.com");
       //save user
	   User u=repository.save(user);
	   System.out.println(u);
	
	}

}
