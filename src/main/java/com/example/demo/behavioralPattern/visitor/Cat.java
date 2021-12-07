package com.example.demo.behavioralPattern.visitor;

/**
 * @author jl.yao
 * @className Cat
 * @description
 * @date 2021/12/7 15:01
 **/
public class Cat implements Animal{

    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好好吃，喵喵喵！！！");
    }

}
