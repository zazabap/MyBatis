package com.example.mybatisplus.Controller;

import com.example.mybatisplus.pojo.User;
import com.example.mybatisplus.service.UserService;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.websocket.server.PathParam;
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

    @RequestMapping(value = "/user/create/{name}/{password}/{email}",
            method= RequestMethod.POST)
    public void createUser(@PathVariable String name,
                           @PathVariable String password,
                           @PathVariable String email){
        System.out.println("Test put value: ");
        System.out.println(name);
        System.out.println(password);
        System.out.println(email);
        userService.createUser(name, password, email);
    }

    @RequestMapping(value = "/tester/{testput}/{testput2}", method = RequestMethod.PUT)
    public void testPutUser(@PathVariable String testput, @PathVariable String testput2){
        System.out.println("Test put value: ");
        System.out.println(testput);
        System.out.println("Test put2 value: ");
        System.out.println(testput2);

    }


}
