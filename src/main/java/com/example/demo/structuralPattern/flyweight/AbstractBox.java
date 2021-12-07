package com.example.demo.structuralPattern.flyweight;

/**
 * @author jl.yao
 * @className AbstractBox
 * @description
 * @date 2021/12/7 10:37
 **/
public abstract class AbstractBox {
    public abstract String getShape();

    public void display(String color) {
        System.out.println("方块形状：" + this.getShape() + " 颜色：" + color);
    }
}
