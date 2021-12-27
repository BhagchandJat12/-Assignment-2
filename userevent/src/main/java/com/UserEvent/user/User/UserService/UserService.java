package com.UserEvent.user.User.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.UserEvent.user.User.Entity.User;

import org.springframework.stereotype.Component;


@Component
public class UserService {
    //create list of user
    private static LinkedList<User> list=new LinkedList<>();
    //create insert method
    public User addUser(User user){
         list.add(user);
         return user;
    }
    public void updateUser(User user, int userid) {
        list= list.stream().map(b->{
       
            if(b.getUid()==userid){
                b.setUid(user.getUid());
                b.setName(user.getName());
                b.setGender(user.getGender());
            b.setEmai(user.getEmai());}
                return b;
            
        }).collect(Collectors.toList());
        
    }
  
    
}
