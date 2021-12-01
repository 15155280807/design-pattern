package com.example.demo.factory.简单工厂;

import com.example.demo.factory.AmericanoCoffee;
import com.example.demo.factory.Coffee;
import com.example.demo.factory.LatteCoffee;

/**
 * @author jl.yao
 * @className SimpleCoffeeFactory
 * @description 简单工厂模式
 * @date 2021/12/1 19:16
 **/
public class SimpleCoffeeFactory {

    /**
     * 简单工厂模式
     */
    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if("americano".equals(type)) {
            coffee = new AmericanoCoffee();
        } else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        }
        return coffee;
    }
    /**
     * 静态工厂模式
     */
    public static Coffee createCoffee1(String type) {
        Coffee coffee = null;
        if("americano".equals(type)) {
            coffee = new AmericanoCoffee();
        } else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        }
        return coffee;
    }
}
