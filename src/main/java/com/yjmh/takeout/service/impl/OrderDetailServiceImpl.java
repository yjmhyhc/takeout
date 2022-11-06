package com.yjmh.takeout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yjmh.takeout.entity.OrderDetail;
import com.yjmh.takeout.mapper.OrderDetailMapper;
import com.yjmh.takeout.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}