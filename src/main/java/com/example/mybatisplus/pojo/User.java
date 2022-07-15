package com.example.mybatisplus.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;
    private String phone;
    private String avatar;
    private String name;
    private String email;
    private String password;
    private Integer favorite;
    private Integer bias;
    private Integer historyBrowse;
    private Integer historyReview;
    private Date lastLogin;

}
