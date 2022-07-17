package com.example.mybatisplus.Controller;

import com.example.mybatisplus.pojo.User;
import com.example.mybatisplus.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "pojo/user")
    public List<User> getUser(){
        return userService.findAll();
    }

    @GetMapping(value = "pojo/searcher")
    public User findUser(User user) {
        return userService.find(user);
    }

    // Super Useful Content
    // https://medium-company.com/spring-boot-mybatis/
    @RequestMapping(value = "/user/login", method =RequestMethod.POST)
    public User login(@ModelAttribute String name, String password) {
        User login = userService.login(name, password);
        return login;
    }


}
