package com.example.demo.factory.抽象工厂方法;

import com.example.demo.factory.AmericanoCoffee;
import com.example.demo.factory.Coffee;
import com.example.demo.factory.Dessert;
import com.example.demo.factory.MatchaMousse;

/**
 * @author jl.yao
 * @className AmericanDessertFactory
 * @description
 * @date 2021/12/1 19:24
 **/
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanoCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
