package com.example.mybatisplus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mybatisplus.pojo.User;

import java.util.List;

/**
 * @author shiwenan
 * @description 针对表【news】的数据库操作Service
 * @createDate 2022-07-15 13:29:37
 */
public interface UserService extends IService<User> {

    List<User> findAll();
    User find(User user);
    User login(String name, String password);

    int insert(User user);

    void createUser(String name, String password, String email);
}
