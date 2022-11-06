package com.yjmh.takeout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yjmh.takeout.entity.DishFlavor;
import com.yjmh.takeout.mapper.DishFlavorMapper;
import com.yjmh.takeout.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
