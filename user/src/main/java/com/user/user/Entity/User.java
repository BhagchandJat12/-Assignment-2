package com.user.user.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.lang.NonNull;
@Entity
public class User {
    //create columns of  table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;

    private String name;

    private  String gender;
    @NonNull
    private  String emai;
    //create constructor
    public User(int uid, String name, String gender, String emai) {
        this.uid = uid;
        this.name = name;
        this.gender = gender;
        this.emai = emai;
    }
    public User() {
    }
    //create getter and setter methods
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
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getEmai() {
        return emai;
    }
    public void setEmai(String emai) {
        this.emai = emai;
    }
    @Override
    public String toString() {
        return "User [emai=" + emai + ", gender=" + gender + ", uid=" + uid + ", name=" + name + "]";
    }

    
}
