package com.user.user.UserController;
import java.util.List;

import com.user.user.Entity.User;
import com.user.user.Entity.UserRepository;
import com.user.user.UserService.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController  {
    
    @Autowired
    UserRepository repository;
    @Autowired
    UserService service;
  //show data on web
    @GetMapping("/home")
    public List<User> getUser(){
      return this.repository.getAllUser();
    }
  //add data from postman
    @PostMapping("/home")
    public User addUser(User user){
        User u1=this.service.addUser(user);
        User u2=this.repository.save(u1);
        System.out.println(u2);
        return u1;
    }
}
