package com.example.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class Ad  {
    /**
     * Primary
     */
    private Integer id;
    private String title;
    private String content;
    private String picHyperlink;
    private Double positionX;
    private Double positionY;
    private String investor;
    private Date datetime;
    private String region;
    private String device;
    private Integer hit;
    private Double weight;

}