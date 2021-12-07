package com.example.demo.behavioralPattern.template;

/**
 * @author jl.yao
 * @className ConcreteClass_BaoCai
 * @description
 * @date 2021/12/7 10:56
 **/
public class ConcreteClass_BaoCai extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
