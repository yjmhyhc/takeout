package com.yjmh.takeout.dto;

import com.yjmh.takeout.entity.Setmeal;
import com.yjmh.takeout.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
