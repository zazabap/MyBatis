package com.example.mybatisplus.mapper;

import com.example.mybatisplus.pojo.News;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisplus.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
* @author shiwenan
* @description 针对表【news】的数据库操作Mapper
* @createDate 2022-07-15 13:29:37
* @Entity com.example.mybatisplus.domain.News
*/
public interface NewsMapper extends BaseMapper<News> {

    Map<String, Object> selectMapById(long id);
    int insert(@Param("news") News news);
    int update(@Param("news") News news);
    int delete(@Param("news") News news);

}




