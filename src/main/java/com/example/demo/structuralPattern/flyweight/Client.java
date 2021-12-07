package com.example.demo.structuralPattern.flyweight;

import org.junit.jupiter.api.Test;

/**
 * @author jl.yao
 * @className Client
 * @description
 * @date 2021/12/7 10:50
 **/
public class Client {

    @Test
    public void test(){
        BoxFactory instance = BoxFactory.getInstance();
        AbstractBox l = instance.getBox("L");
        AbstractBox i = instance.getBox("I");
        AbstractBox o = instance.getBox("O");
        l.display("red");
        i.display("blue");
        o.display("yellow");
    }
}
