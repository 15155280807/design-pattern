package com.example.demo.prototype.原型模式;

/**
 * @author jl.yao
 * @className PrototypeTest
 * @description
 * @date 2021/12/1 19:34
 **/
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype r1 = new Realizetype();
        Realizetype r2 = r1.clone();

        System.out.println("对象r1和r2是同一个对象？" + (r1 == r2));
    }
}
