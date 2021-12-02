package com.example.demo.structuralPattern.decorator;

/**
 * @author jl.yao
 * @className FriedNoodles
 * @description
 * @date 2021/12/2 10:56
 **/
public class FriedNoodles extends FastFood{
    public FriedNoodles() {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
