package com.UserEvent.user.User.UserController;
import java.util.LinkedList;

import javax.transaction.Transactional;

import com.UserEvent.user.User.Entity.User;
import com.UserEvent.user.User.Entity.UserRepository;
import com.UserEvent.user.User.UserService.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController  {
    
    @Autowired
    UserRepository repository;
    @Autowired
    UserService service;
  //show data on web
    @GetMapping("/user")
    public LinkedList<User> getUser(){
      return this.repository.getAllUser();
    }
  //add data from postman
  @Transactional
    @PostMapping("/user")
    public User addUser(@Validated @RequestBody User user){
        this.repository.addUser(user.getUid(),user.getName(),user.getGender(),user.getEmai());
      
        return user;
    }

    @DeleteMapping("/user/{userid}")
    public void deleteEvent(@PathVariable("userid") int id){
           this.repository.deleteById(id);
    }
   @Transactional
    @PutMapping("/user/{userid}")
    public User updatEvent(@RequestBody User user,@PathVariable("userid") int userid){
      
      this.repository.updateUser(user.getUid(),user.getName(),user.getGender(),user.getEmai(),userid);
      return user;
    }
}
