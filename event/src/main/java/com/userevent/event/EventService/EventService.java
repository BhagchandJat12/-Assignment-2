package com.userevent.event.EventService;

import java.util.ArrayList;
import java.util.List;
import com.userevent.event.Entity.Event;

import org.springframework.stereotype.Component;

@Component
public class EventService {
    //create list of event
    private static List<Event> list=new ArrayList<>();
   
    //create method for addevent
    public Event addEvent(Event event){
         list.add(event);
         return event;
    }
}
