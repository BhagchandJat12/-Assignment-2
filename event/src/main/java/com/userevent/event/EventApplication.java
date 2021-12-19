package com.userevent.event;
import com.userevent.event.Entity.Event;
import com.userevent.event.Entity.EventRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class EventApplication {

	public static void main(String[] args) {
		ApplicationContext context=	SpringApplication.run(EventApplication.class, args);
		EventRepository repository=context.getBean(EventRepository.class);
		//create object
		Event event=new Event();
		//insert values
		event.setUid(2);
		event.setName("Ram");
		event.setOccurrence("YEARLY");
		event.setStartDate("2019-10-12");
		event.setEndDate("2019-10-23");
		//save values on database
		Event e=repository.save(event);
		//print value on console
		System.out.println(e);
	}

}
