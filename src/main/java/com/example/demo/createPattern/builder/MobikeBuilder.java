package com.example.demo.createPattern.builder;

/**
 * @author jl.yao
 * @className MobikeBuilder
 * @description
 * @date 2021/12/2 10:15
 **/
public class MobikeBuilder extends Builder {
    @Override
    public void buildFrame() {
        mBike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
