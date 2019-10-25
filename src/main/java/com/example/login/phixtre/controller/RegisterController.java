package com.example.login.phixtre.controller;

import com.example.login.phixtre.entity.User;
import com.example.login.phixtre.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: wtl
 * @Date: 2019/7/31
 */
@RestController
public class RegisterController {

    @Autowired
    private UserService service;

    @RequestMapping("/hello")
    public String helloWorld(){
        return "你好，世界！";
    }

    @GetMapping("/findUser")
    public User findUser(){
        User user = new User("张三","123456");
        return service.findUser(user.getName(),user.getPassword());
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.GET)
    public void addUser(){
        User user = new User("张三","123456");
        service.addUser(user);
    }

    @RequestMapping("/findUserById")
    public User findUserById(int id){
        return service.findUserById(id);
    }
}
