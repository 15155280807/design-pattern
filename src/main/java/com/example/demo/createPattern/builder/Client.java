package com.example.demo.createPattern.builder;

import org.junit.jupiter.api.Test;

/**
 * @author jl.yao
 * @className Client
 * @description
 * @date 2021/12/2 10:17
 **/
public class Client {


    @Test
    public void test(){
        showBike(new OfoBuilder());
        showBike(new MobikeBuilder());
    }
    private void showBike(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
