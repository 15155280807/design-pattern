package com.example.demo.behavioralPattern.strategy;

/**
 * @author jl.yao
 * @className SalesMan
 * @description
 * @date 2021/12/7 11:03
 **/
public class SalesMan {
    //持有抽象策略角色的引用
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    //向客户展示促销活动
    public void salesManShow(){
        strategy.show();
    }
}
