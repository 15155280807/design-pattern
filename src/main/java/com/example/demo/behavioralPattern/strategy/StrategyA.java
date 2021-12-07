package com.example.demo.behavioralPattern.strategy;

/**
 * @author jl.yao
 * @className StrategyA
 * @description
 * @date 2021/12/7 11:03
 **/
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
