package com.example.demo.behavioralPattern.mediator;

/**
 * @author jl.yao
 * @className Mediator
 * @description
 * @date 2021/12/7 14:41
 **/
//抽象中介者
public abstract class Mediator {
    //申明一个联络方法
    public abstract void constact(String message,Person person);
}
