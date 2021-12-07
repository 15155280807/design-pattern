package com.example.demo.behavioralPattern.template;

/**
 * @author jl.yao
 * @className ConcreteClass_CaiXin
 * @description
 * @date 2021/12/7 10:56
 **/
public class ConcreteClass_CaiXin extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}
