package com.example.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;


@Data
public class News {

    private Integer id;
    private String title;
    private Date datetime;
    private String author;
    private String content;
    private Integer hitVol;
    private Integer favoriteVol;
    private Integer forwardVol;
    private Integer paidFlag;

}