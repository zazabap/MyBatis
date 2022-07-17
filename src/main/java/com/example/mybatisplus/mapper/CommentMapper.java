package com.example.mybatisplus.mapper;

import com.example.mybatisplus.pojo.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
* @author shiwenan
* @description 针对表【comment】的数据库操作Mapper
* @createDate 2022-07-15 13:31:41
* @Entity com.example.mybatisplus.pojo.Comment
*/
public interface CommentMapper extends BaseMapper<Comment> {

    Map<String, Object> selectMapById(long id);
    int insert(@Param("comment") Comment comment);
    int update(@Param("comment") Comment comment);
    int delete(@Param("comment") Comment comment);

}




