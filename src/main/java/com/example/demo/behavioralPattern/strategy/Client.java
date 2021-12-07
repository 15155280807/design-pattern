package com.example.demo.behavioralPattern.strategy;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.jupiter.api.Test;

/**
 * @author jl.yao
 * @className Client
 * @description
 * @date 2021/12/7 11:15
 **/
public class Client {

    @Test
    public void test(){
        SalesMan salesMan = new SalesMan(new StrategyB());
        salesMan.salesManShow();
    }
}
