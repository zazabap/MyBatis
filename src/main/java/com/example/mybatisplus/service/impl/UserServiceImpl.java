package com.example.mybatisplus.service.impl;

import com.baomidou.mybatisplus.core.assist.ISqlRunner;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplus.mapper.UserMapper;
import com.example.mybatisplus.pojo.User;
import com.example.mybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shiwenan
 * @description 针对表【comment】的数据库操作Service实现
 * @createDate 2022-07-15 13:31:41
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

    @Autowired
    private UserMapper userMapper;
    public List<User> findAll(){
        return userMapper.selectList(null);
    }

    public User find(User user){
        return userMapper.selectById(user.getId());
    }


    @Override
    public User login(String name, String password) {
        if ( name == null || password == null) {
            System.out.println("No Such Account");
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", name);
        queryWrapper.eq("password", password);

        return userMapper.selectOne(queryWrapper);
    }

    @Override
    public int insert(User user) {
        return 0;
    }

    @Override
    public void createUser(String name, String password, String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        System.out.println("Create User");
        int result = userMapper.insert(user);
        System.out.println("=========================");
        System.out.println("result: "+result);
        System.out.println("id: "+ user.getId());
        System.out.println("=========================");
    }

    //    @Override
//    public User getUserByName(String name) {
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//
//        queryWrapper.select("name", "email");
//        queryWrapper.inSql("name", "select * from user where name = "+name);
//        List<Map<String, Object>> maps = userMapper.selectMaps(queryWrapper);
//        maps.forEach(System.out::println);
//        return (User) maps.get(0);
//    }

}
