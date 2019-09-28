package com.example.login.phixtre.dao;

import com.example.login.phixtre.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author: wtl
 * @Date: 2019/7/31
 */
@Repository
public interface UserDao extends JpaRepository<User,Integer>{

    @Query(value = "select * from  user where name=:name and password=:password",nativeQuery = true)
    User findUser(@Param("name") String name, @Param("password")String password);

}
