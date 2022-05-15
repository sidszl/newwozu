package com.zl.us.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zl.us.entity.UserEntity;
import com.zl.us.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper, UserEntity> {

    public UserEntity getUserByUsername(String username) {
        QueryWrapper<UserEntity> wrapper = new QueryWrapper<>();
        wrapper.eq("username", username);
        return baseMapper.selectOne(wrapper);
    }

}