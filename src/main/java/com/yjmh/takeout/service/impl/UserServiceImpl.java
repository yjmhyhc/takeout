package com.yjmh.takeout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yjmh.takeout.entity.User;
import com.yjmh.takeout.mapper.UserMapper;
import com.yjmh.takeout.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{
}
