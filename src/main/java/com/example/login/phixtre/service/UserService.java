package com.example.login.phixtre.service;


import com.example.login.phixtre.entity.User;

/**
 * @Author: wtl
 * @Date: 2019/7/31
 */
public interface UserService {

    User findUser(String name, String password);

    void addUser(User user);

    User findUserById(int userId);

    String redisTest();
}
