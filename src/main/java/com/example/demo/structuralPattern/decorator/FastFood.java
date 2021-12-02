package com.example.demo.structuralPattern.decorator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jl.yao
 * @className FastFood
 * @description
 * @date 2021/12/2 10:55
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class FastFood {
    private float price;
    private String desc;
    public abstract float cost();
}
