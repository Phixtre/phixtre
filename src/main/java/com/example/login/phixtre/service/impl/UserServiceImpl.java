package com.example.login.phixtre.service.impl;

import com.example.login.phixtre.dao.UserDao;
import com.example.login.phixtre.entity.User;
import com.example.login.phixtre.mapper.UserMapper;
import com.example.login.phixtre.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: wtl
 * @Date: 2019/7/31
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;
    @Autowired
    private UserMapper mapper;

    @Override
    public User findUser(String name, String password) {
        User user = dao.findUser(name,password);
        System.out.println(user);
        return user;
    }

    @Override
    public void addUser(User user) {
        this.dao.save(user);
    }

    @Override
    public User findUserById(int userId) {
        return mapper.findUserById(userId);
    }
}
