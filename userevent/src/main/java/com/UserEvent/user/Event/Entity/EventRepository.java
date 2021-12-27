package com.UserEvent.userEvent.Event.Entity;
import java.util.LinkedList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event,Integer>{
    //query for showing data of table
    @Query(value = "select * from Event", nativeQuery = true)
    public LinkedList<Event> getAllEvent();

}
