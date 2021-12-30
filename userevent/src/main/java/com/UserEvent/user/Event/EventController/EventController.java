package com.UserEvent.user.Event.EventController;

import java.util.LinkedList;

import javax.transaction.Transactional;

import com.UserEvent.user.Event.Entity.Event;
import com.UserEvent.user.Event.Entity.EventRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
    @Autowired
    EventRepository repository;
   
  //show table on webPage
    @GetMapping("/event")
    public LinkedList<Event > getEvent(){
      LinkedList<Event> list=repository.getAllEvent();
     
      return list;
    }
     //add new element in table
    @Transactional
    @PostMapping("/event")
    public Event addEvent(@Validated @RequestBody Event event){
        this.repository.addEvent(event.getUid(),event.getName(),event.getOccurrence(),event.getStartDate(),event.getEndDate());
        
        return event;
    }

    @DeleteMapping("/event/{eventid}")
    public void deleteEvent(@PathVariable("eventid") int id){
           this.repository.deleteById(id);
    }
  
    @Transactional
    @PutMapping("/home/{eventid}")
    public Event updatEvent(@RequestBody Event event,@PathVariable("eventid") int eventid){
      
      this.repository.updateEvent(event.getId(),event.getUid(),event.getName(),event.getOccurrence(),event.getStartDate(),event.getEndDate(),eventid);
      return event;
    }
}
