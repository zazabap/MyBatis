package com.example.mybatisplus.service;

import com.example.mybatisplus.pojo.Ad;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mybatisplus.pojo.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
* @author shiwenan
* @description 针对表【ad】的数据库操作Service
* @createDate 2022-07-15 13:32:13
*/
public interface AdService extends IService<Ad> {

    List<Ad> searchAllAds();

}
