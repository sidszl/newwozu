package com.zl.us.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zl.us.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
}
