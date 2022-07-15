package com.example.mybatisplus.mapper;

import com.example.mybatisplus.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.Map;

public interface UserMapper extends BaseMapper<User>{

    // Return only the wanted object instead of
    // all the object inside database
    // Modified also in UserMapper.xml part
    Map<String, Object> selectMapById(long id);

}
