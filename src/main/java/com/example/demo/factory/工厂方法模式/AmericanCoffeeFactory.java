package com.example.demo.factory.工厂方法模式;

import com.example.demo.factory.AmericanoCoffee;
import com.example.demo.factory.Coffee;

/**
 * @author jl.yao
 * @className AmericanCoffeeFactory
 * @description
 * @date 2021/12/1 19:21
 **/
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanoCoffee();
    }
}
