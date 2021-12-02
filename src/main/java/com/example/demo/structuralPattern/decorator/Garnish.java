package com.example.demo.structuralPattern.decorator;

/**
 * @author jl.yao
 * @className Garnish
 * @description
 * @date 2021/12/2 10:57
 **/
public abstract class Garnish extends FastFood{
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price,desc);
        this.fastFood = fastFood;
    }
}
