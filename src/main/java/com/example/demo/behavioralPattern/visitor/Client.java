package com.example.demo.behavioralPattern.visitor;

import org.junit.jupiter.api.Test;

/**
 * @author jl.yao
 * @className Client
 * @description
 * @date 2021/12/7 15:02
 **/
public class Client {

    @Test
    public  void test() {
        Home home = new Home();
        home.add(new Dog());
        home.add(new Cat());

        Owner owner = new Owner();
        home.action(owner);

        Someone someone = new Someone();
        home.action(someone);
    }
}
