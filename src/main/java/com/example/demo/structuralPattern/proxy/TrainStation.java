package com.example.demo.structuralPattern.proxy;/**
 * @author jl.yao
 * @className TrainStation
 * @description 
 * @date 2021/12/2 10:29
 **/
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
