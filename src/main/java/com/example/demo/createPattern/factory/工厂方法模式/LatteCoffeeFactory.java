package com.example.demo.createPattern.factory.工厂方法模式;

import com.example.demo.createPattern.factory.Coffee;
import com.example.demo.createPattern.factory.LatteCoffee;

/**
 * @author jl.yao
 * @className LatteCoffeeFactory
 * @description
 * @date 2021/12/1 19:20
 **/
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
