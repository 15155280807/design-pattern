package com.example.demo.createPattern.builder;

/**
 * @author jl.yao
 * @className Director
 * @description
 * @date 2021/12/2 10:16
 **/
public class Director {
    public Builder mBuilder;

    public Director(Builder builder){
        mBuilder=builder;
    }

    public Bike construct(){
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        return mBuilder.createBike();
    }
}
