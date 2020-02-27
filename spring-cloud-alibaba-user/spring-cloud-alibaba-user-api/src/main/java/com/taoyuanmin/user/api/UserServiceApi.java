package com.taoyuanmin.user.api;

import com.taoyuanmin.user.entity.User;

import java.util.List;

public interface UserServiceApi {

    User findOne(Integer userId);

    List<User> list();

}
