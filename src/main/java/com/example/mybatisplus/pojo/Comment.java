package com.example.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Comment {

    private Integer id;
    private Integer uid;
    private Integer nid;
    private String content;
    private Date datetime;
    private Integer upvote;
    private Integer downvote;

}