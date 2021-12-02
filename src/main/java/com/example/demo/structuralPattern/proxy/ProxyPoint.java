package com.example.demo.structuralPattern.proxy;

/**
 * @author jl.yao
 * @className ProxyPoint
 * @description
 * @date 2021/12/2 10:29
 **/
public class ProxyPoint implements SellTickets{
    private TrainStation station = new TrainStation();
    @Override
    public void sell() {
        System.out.println("代理点收取一些服务费用");
        station.sell();
    }
}
