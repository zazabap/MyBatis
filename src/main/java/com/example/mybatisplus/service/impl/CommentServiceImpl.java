package com.example.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplus.pojo.Comment;
import com.example.mybatisplus.service.CommentService;
import com.example.mybatisplus.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author shiwenan
* @description 针对表【comment】的数据库操作Service实现
* @createDate 2022-07-15 13:31:41
*/
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment>
    implements CommentService{

    @Autowired
    private CommentMapper commentMapper;
    @Override
    public List<Comment> searchAllComments() {

        return commentMapper.selectList(null);
    }
}




