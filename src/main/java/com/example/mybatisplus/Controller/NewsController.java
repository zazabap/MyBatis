package com.example.mybatisplus.Controller;

import com.example.mybatisplus.pojo.News;
import com.example.mybatisplus.pojo.User;
import com.example.mybatisplus.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController {
    @Autowired
    private NewsService newsService;

    @GetMapping(value = "pojo/news")
    public List<News> getNews(){
        return newsService.searchAllNews() ;
    }


}
