package com.user.user.UserService;

import java.util.ArrayList;
import java.util.List;

import com.user.user.Entity.User;

import org.springframework.stereotype.Component;


@Component
public class UserService {
    //create list of event
    private static List<User> list=new ArrayList<>();
    //create insert method
    public User addUser(User user){
         list.add(user);
         return user;
    }
  
    
}
