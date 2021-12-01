package com.example.demo.factory.抽象工厂方法;

import com.example.demo.factory.Coffee;
import com.example.demo.factory.Dessert;

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
