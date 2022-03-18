package com.yxyl.service.impl;

import com.yxyl.dao.UserDao;
import com.yxyl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;



}
