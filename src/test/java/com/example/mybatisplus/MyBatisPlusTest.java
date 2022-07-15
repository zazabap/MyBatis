package com.example.mybatisplus;


import com.example.mybatisplus.mapper.UserMapper;
import com.example.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class MyBatisPlusTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectList(){
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setName("SweetTea");
        user.setEmail("st@cern.ch");
        user.setPassword("123456");
        int result = userMapper.insert(user);
        System.out.println("=========================");
        System.out.println("result: "+result);
        System.out.println("id: "+ user.getId());
        System.out.println("=========================");
    }

    @Test
    public void testDelete(){
        int result = userMapper.deleteById(1403441153);
        System.out.println("=========================");
        System.out.println("result: "+result);
        System.out.println("=========================");
        testInsert();

        Map<String, Object> map = new HashMap<>();
        map.put("name", "SweetTea");
        map.put("email","st@cern.ch");
        result = userMapper.deleteByMap(map);
        System.out.println("=========================");
        System.out.println("result: "+result);
        System.out.println("=========================");
        testInsert();
        // Through multiple ids to realize deletion
//        List<Long> list = Arrays.asList(1L,2L,3L);
//        int result = userTblMapper.deleteBatchIds(list);
//        System.out.println("result: "+result);
    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(4);
        user.setName("jojo");
        user.setEmail("jojo@kek.jp");
        int result = userMapper.updateById(user);
        System.out.println("=========================");
        System.out.println("result: "+result);
        System.out.println("=========================");
    }

    @Test
    public void testSelect(){
        // Search through ID and get value
//        User user = userMapper.selectById(1L);
//        System.out.println(user);

        // Search multiple
//        List<Long> list = Arrays.asList(1L,2L,3L);
//        List<User> users = userMapper.selectBatchIds(list);
//        users.forEach(System.out::println);

        // Select by hash map
//        Map<String, Object> map = new HashMap<>();
//        map.put("name", "Liz");
//        List<User> users = userMapper.selectByMap(map);
//        users.forEach(System.out::println);

        Map<String, Object> map = userMapper.selectMapById(1L);
        System.out.println(map);
    }


}
