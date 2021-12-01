package com.example.demo.factory.抽象工厂方法;

import com.example.demo.factory.Coffee;
import com.example.demo.factory.Dessert;
import com.example.demo.factory.LatteCoffee;
import com.example.demo.factory.Tiramisu;

/**
 * @author jl.yao
 * @className ItalyDessertFactory
 * @description
 * @date 2021/12/1 19:26
 **/
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
