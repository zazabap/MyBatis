package com.example.mybatisplus.mapper;

import com.example.mybatisplus.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserMapper extends BaseMapper<User> {

    // Return only the wanted object instead of
    // all the object inside database
    // Modified also in UserMapper.xml part
    Map<String, Object> selectMapById(long id);

    //User login(String name, String password);

    int insert(@Param("user") User user);

    int update(@Param("user") User user);

    int delete(@Param("user") User user);

    //void createUser(String name, String password, String email);

    //int insert2(User user);
}
