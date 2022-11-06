package com.yjmh.takeout.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yjmh.takeout.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
