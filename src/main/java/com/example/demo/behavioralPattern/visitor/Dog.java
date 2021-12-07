package com.example.demo.behavioralPattern.visitor;

/**
 * @author jl.yao
 * @className Dog
 * @description
 * @date 2021/12/7 15:01
 **/
public class Dog implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好好吃，汪汪汪！！！");
    }
}
