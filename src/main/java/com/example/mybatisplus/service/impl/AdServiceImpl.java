package com.example.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplus.pojo.Ad;
import com.example.mybatisplus.service.AdService;
import com.example.mybatisplus.mapper.AdMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author shiwenan
* @description 针对表【ad】的数据库操作Service实现
* @createDate 2022-07-15 13:32:13
*/
@Service
public class AdServiceImpl extends ServiceImpl<AdMapper, Ad>
    implements AdService{

    private AdMapper adMapper;

    @Override
    public List<Ad> searchAllAds(){
        return adMapper.selectList(null);
    }
}




