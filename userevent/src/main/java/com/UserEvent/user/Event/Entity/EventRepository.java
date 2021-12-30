package com.UserEvent.user.Event.Entity;
import java.time.LocalDate;
import java.util.LinkedList;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface EventRepository extends CrudRepository<Event,Integer>{
    //query for showing data of table
    @Query(value = "select * from Event", nativeQuery = true)
    public LinkedList<Event> getAllEvent();

    @Modifying
    @Query(value="update Event b set b.id=:m,  b.uid= :i ,b.name=:n,b.occurrence=:o, b.startDate= :s , b.endDate= :e  where b.id= :u", nativeQuery = true)
    public void updateEvent(@Param("m") int Id,@Param("i") int Uid,@Param("n") String name,@Param("o") String ocuur,@Param("s") LocalDate start,@Param("e") LocalDate end,@Param("u") int id);
    
    @Modifying
    @Query(value = "insert into Event (uid,name,occurrence,startDate,endDate) values(:i ,:n,:o,:s,:e)",nativeQuery = true)
    public void addEvent(@Param("i") int Uid,@Param("n") String name,@Param("o") String ocuur,@Param("s") LocalDate start,@Param("e") LocalDate end);

}
