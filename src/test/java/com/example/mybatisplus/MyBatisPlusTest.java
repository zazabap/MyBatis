package com.example.mybatisplus;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mybatisplus.mapper.AdMapper;
import com.example.mybatisplus.mapper.CommentMapper;
import com.example.mybatisplus.mapper.NewsMapper;
import com.example.mybatisplus.mapper.UserMapper;
import com.example.mybatisplus.pojo.Ad;
import com.example.mybatisplus.pojo.Comment;
import com.example.mybatisplus.pojo.News;
import com.example.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class MyBatisPlusTest {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private NewsMapper newsMapper;

    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    private AdMapper adMapper;

    @Test
    public void testUserSelectList(){
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    public void testNewsSelectList(){
        List<News> list = newsMapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    public void testCommentSelectList(){
        List<Comment> list = commentMapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    public void testAdSelectList(){
        List<Ad> list = adMapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    public void testAllSelectList(){
        testUserSelectList();
        testNewsSelectList();
        testCommentSelectList();
        testAdSelectList();
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
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Liz");
        List<User> users = userMapper.selectByMap(map);
        users.forEach(System.out::println);

        Map<String, Object> map1 = userMapper.selectMapById(1L);
        System.out.println(map1);
    }


    // Select only certain column
    @Test
    public void selectValue(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("name", "email");
        List<Map<String, Object>> maps = userMapper.selectMaps(queryWrapper);
        maps.forEach(System.out::println);
    }

    @Test
    public void selectTopValue(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();

        queryWrapper.select("name", "email");
        queryWrapper.inSql("name", "select name from user where id<=3");
        List<Map<String, Object>> maps = userMapper.selectMaps(queryWrapper);
        maps.forEach(System.out::println);
    }

    @Test
    public void selectValueOne(){
        String name = "Liz";
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();

        queryWrapper.select("name", "email");
        queryWrapper.inSql("name", "select * from user where name=#{"+name+"}");
        List<Map<String, Object>> maps = userMapper.selectMaps(queryWrapper);
        maps.forEach(System.out::println);
        User uu = userMapper.selectOne(queryWrapper);
        System.out.println(uu.getName());
    }

    @Test
    public void selectUser(){
        String name = "Liz";
        String password = "123456";
//        if ( name == null || password == null) {
//            System.out.println("No Such Account");
//        }
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("name", name);
//        queryWrapper.eq("password", password);
//
//        User t= userMapper.selectOne(queryWrapper);
//        System.out.println(t.toString());

        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("password", password);
        List<User> users = userMapper.selectByMap(map);
        users.forEach(System.out::println);
        Map<String, Object> map1 = userMapper.selectMapById(1L);
        System.out.println(map1);

    }


}
