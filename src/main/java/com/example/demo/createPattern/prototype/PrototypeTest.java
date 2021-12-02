package com.example.demo.createPattern.prototype;

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
