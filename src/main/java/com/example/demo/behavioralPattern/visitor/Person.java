package com.example.demo.behavioralPattern.visitor;

/**
 * @author jl.yao
 * @className Person
 * @description
 * @date 2021/12/7 15:00
 **/
public interface  Person {
    void feed(Cat cat);

    void feed(Dog dog);
}
