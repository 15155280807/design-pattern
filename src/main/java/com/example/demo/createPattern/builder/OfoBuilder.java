package com.example.demo.createPattern.builder;

/**
 * @author jl.yao
 * @className OfoBuilder
 * @description
 * @date 2021/12/2 10:16
 **/
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        mBike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
