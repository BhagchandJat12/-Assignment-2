package com.UserEvent.user.Event.EventService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.UserEvent.user.Event.Entity.Event;
import com.UserEvent.user.Event.Entity.EventRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventService {

    @Autowired
    EventRepository repository;
    //create list of event
   private static  ArrayList<Event> list=new ArrayList<>();
   
    
    //create method for addevent
    public Event addEvent(Event event){
         this.repository.save(event);
         return event;
    }
// update the Event
    public void updateEvent(Event event,int eventid){
       list=(ArrayList<Event>) list.stream().map(b->{
       
        if(b.getId()==eventid){
            b.setUid(event.getUid());
            b.setName(event.getName());
            b.setOccurrence(event.getOccurrence());
            b.setStartDate(event.getStartDate());
            b.setEndDate(event.getEndDate());}
            return b;
        
    }).collect(Collectors.toList());
    }
}
