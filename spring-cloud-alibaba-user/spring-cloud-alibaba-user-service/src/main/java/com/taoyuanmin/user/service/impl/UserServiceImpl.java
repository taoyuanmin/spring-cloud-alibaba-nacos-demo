package com.taoyuanmin.user.service.impl;

import com.taoyuanmin.user.api.UserServiceApi;
import com.taoyuanmin.user.entity.User;
import com.taoyuanmin.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServiceApi {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User findOne(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<User> list() {
        return null;
    }
}
