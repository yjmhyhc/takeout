package com.yjmh.takeout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yjmh.takeout.entity.ShoppingCart;
import com.yjmh.takeout.mapper.ShoppingCartMapper;
import com.yjmh.takeout.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
