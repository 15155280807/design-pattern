package com.example.demo.factory.工厂方法模式;

import com.example.demo.factory.Coffee;

/**
 * @author jl.yao
 * @className CoffeeStore
 * @description
 * @date 2021/12/1 19:21
 **/
public class CoffeeStore {
    private CoffeeFactory factory;

    public CoffeeStore(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee(String type) {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}
