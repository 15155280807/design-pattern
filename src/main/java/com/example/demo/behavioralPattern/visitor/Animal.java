package com.example.demo.behavioralPattern.visitor;

/**
 * @author jl.yao
 * @className Animal
 * @description
 * @date 2021/12/7 15:01
 **/
public interface Animal {
    void accept(Person person);
}
