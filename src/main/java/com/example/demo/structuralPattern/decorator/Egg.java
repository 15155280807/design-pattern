package com.example.demo.structuralPattern.decorator;

/**
 * @author jl.yao
 * @className Egg
 * @description
 * @date 2021/12/2 10:57
 **/
public class Egg extends Garnish {
    public Egg(FastFood fastFood) {
        super(fastFood,1,"鸡蛋");
    }
    @Override
    public float cost() {
        return getPrice() + getFastFood().getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
