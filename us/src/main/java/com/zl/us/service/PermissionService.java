package com.zl.us.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zl.us.entity.PermissionEntry;
import com.zl.us.mapper.PermissionMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionService extends ServiceImpl<PermissionMapper, PermissionEntry> {


    public List<PermissionEntry> getPermissionsByUserId(Integer userId){

        return baseMapper.selectPermissionsByUserId(userId);
    }

}