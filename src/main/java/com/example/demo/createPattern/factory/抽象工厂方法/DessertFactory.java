package com.example.demo.createPattern.factory.抽象工厂方法;

import com.example.demo.createPattern.factory.Coffee;
import com.example.demo.createPattern.factory.Dessert;

/**
 * @author jl.yao
 * @className DessertFactory
 * @description
 * @date 2021/12/1 19:24
 **/
public interface DessertFactory {
    Coffee createCoffee();

    Dessert createDessert();
}
