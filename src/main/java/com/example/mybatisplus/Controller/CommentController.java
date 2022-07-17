package com.example.mybatisplus.Controller;


import com.example.mybatisplus.pojo.Comment;
import com.example.mybatisplus.pojo.News;
import com.example.mybatisplus.service.CommentService;
import com.example.mybatisplus.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping(value = "pojo/comments")
    public List<Comment> getComment(){
        return commentService.searchAllComments() ;
    }
}
