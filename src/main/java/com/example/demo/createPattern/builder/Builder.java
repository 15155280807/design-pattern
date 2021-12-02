package com.example.demo.createPattern.builder;

/**
 * @author jl.yao
 * @className Builder
 * @description
 * @date 2021/12/2 10:15
 **/
public abstract class Builder {
    protected Bike mBike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();
}
