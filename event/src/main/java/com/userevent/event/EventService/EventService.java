package com.userevent.event.EventService;

import java.util.ArrayList;
import java.util.List;
import com.userevent.event.Entity.Event;

import org.springframework.stereotype.Component;

@Component
public class EventService {
    //create list of event
    private static List<Event> list=new ArrayList<>();
    static {
        list.add(new Event(8,7,"Bhag","YERLY","2018-10-15","2018-10-25"));
    }
    //create method for addevent
    public Event addEvent(Event event){
         list.add(event);
         return event;
    }
}
