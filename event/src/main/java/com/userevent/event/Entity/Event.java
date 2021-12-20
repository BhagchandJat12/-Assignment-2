package com.userevent.event.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.lang.NonNull;
import java.time.LocalDate;

@Entity
public class Event {
    //create table column
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private int uid;
    private String name;
    @NonNULL
    private String occurrence;
    @NonNULL
    private LocalDate startDate;
    private  LocalDate endDate;
    //create constrctor
    public Event(int id, int uid, String name, String occurrence,  LocalDate startDate , LocalDate endDate) {
        this.id = id;
        this.uid = uid;
        this.name = name;
        this.occurrence = occurrence;
        this.startDate=startDate;
        this.endDate=endDate;
    }
    public Event() {
    }
    //getter and setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOccurrence() {
        return occurrence;
    }
    public void setOccurrence(String occurrence) {
        this.occurrence = occurrence;
    }
    public  LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate ( LocalDate startDate) {
        this.startDate= startDate;
    }
    public  LocalDate getEndDate() {
        return endDate;

    }
    public void setEndDate(  LocalDate endDate) {
        this.endDate= endDate;
    }
    @Override
    public String toString() {
        return "Event [id=" + id + ",uid=" + uid + ",  name=" + name + ", occurrence=" + occurrence
                + ", startDate=" + startDate + ", endDate=" + endDate + "]";

    }
    
    
    
}
