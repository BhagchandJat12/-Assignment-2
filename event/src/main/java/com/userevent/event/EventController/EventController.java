package com.userevent.event.EventController;

import java.util.List;

import com.userevent.event.Entity.Event;
import com.userevent.event.Entity.EventRepository;
import com.userevent.event.EventService.EventService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
    @Autowired
    EventRepository repository;
    @Autowired
    EventService service;
  //show table on webPage
    @GetMapping("/home")
    public List<Event> getEvent(){
      return this.repository.getAllEvent();
    }
     //add new element in table
    @PostMapping("/home")
    public Event addEvent(@Validated @RequestBody  Event event){
        Event e1=this.service.addEvent(event);
        Event e2=this.repository.save(event);
        System.out.println(e2);
        return e1;
    }
}
