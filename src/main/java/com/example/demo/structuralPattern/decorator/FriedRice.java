package com.example.demo.structuralPattern.decorator;

import lombok.Data;

/**
 * @author jl.yao
 * @className FriedRice
 * @description
 * @date 2021/12/2 10:55
 **/
public class FriedRice extends FastFood{
    public FriedRice() {
        super(10, "炒饭");
    }
    @Override
    public float cost() {
        return getPrice();
    }
}
