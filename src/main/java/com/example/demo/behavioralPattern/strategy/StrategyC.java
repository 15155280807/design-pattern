package com.example.demo.behavioralPattern.strategy;

/**
 * @author jl.yao
 * @className StrategyC
 * @description
 * @date 2021/12/7 11:03
 **/
public class StrategyC implements Strategy{
    @Override
    public void show() {
        System.out.println("满1000元加一元换购任意200元以下商品");
    }
}
