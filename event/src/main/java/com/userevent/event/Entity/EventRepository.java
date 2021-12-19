package com.userevent.event.Entity;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event,Integer>{
    //query for showing data of table
    @Query(value = "select * from Event", nativeQuery = true)
    public List<Event> getAllEvent();
}
