package com.UserEvent.user.User.Entity;

import java.util.LinkedList;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User,Integer> {
    
    //write sql query for showing data
    @Query(value = "select * from User", nativeQuery = true)
    public LinkedList<User> getAllUser();

    @Modifying
    @Query(value="update  User b set b.uid=:m,  b.name= :i ,b.gender=:g, b.emai= :s   where b.uid= :u", nativeQuery = true)
    public void updateUser(@Param("m") int Uid,@Param("i") String Name,@Param("g") String gender,@Param("s") String Email,@Param("u") int uid);
    
    @Modifying
    @Query(value = "insert into User (uid,name,gender,emai) values(:i ,:s,:g,:e)",nativeQuery = true)
    public void addUser(@Param("i") int Uid,@Param("s") String Name,@Param("g") String gender,@Param("e") String Email);

}
