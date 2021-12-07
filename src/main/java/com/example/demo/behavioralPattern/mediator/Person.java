package com.example.demo.behavioralPattern.mediator;

/**
 * @author jl.yao
 * @className Person
 * @description
 * @date 2021/12/7 14:41
 **/
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name,Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }
}
