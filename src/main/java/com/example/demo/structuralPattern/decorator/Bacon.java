package com.example.demo.structuralPattern.decorator;

/**
 * @author jl.yao
 * @className Bacon
 * @description
 * @date 2021/12/2 10:58
 **/
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood) {
        super(fastFood,2,"培根");
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
