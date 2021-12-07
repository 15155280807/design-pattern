package com.example.demo.behavioralPattern.strategy;

/**
 * @author jl.yao
 * @className StrategyB
 * @description
 * @date 2021/12/7 11:03
 **/
public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("满200元减50元");
    }
}
