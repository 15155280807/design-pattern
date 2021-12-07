package com.example.demo.behavioralPattern.visitor;

/**
 * @author jl.yao
 * @className Someone
 * @description
 * @date 2021/12/7 15:00
 **/
public class Someone implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("其他人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("其他人喂食狗");
    }
}
