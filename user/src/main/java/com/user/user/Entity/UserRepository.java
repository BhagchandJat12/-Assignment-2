package com.user.user.Entity;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
    
    //write sql query for showing data
    @Query(value = "select * from User", nativeQuery = true)
    public List<User> getAllUser();

}
