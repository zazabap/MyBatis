package com.example.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplus.pojo.News;
import com.example.mybatisplus.service.NewsService;
import com.example.mybatisplus.mapper.NewsMapper;
import org.springframework.stereotype.Service;

/**
* @author shiwenan
* @description 针对表【news】的数据库操作Service实现
* @createDate 2022-07-15 13:29:37
*/
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News>
    implements NewsService{

}




