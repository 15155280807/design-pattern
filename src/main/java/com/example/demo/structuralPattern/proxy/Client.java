package com.example.demo.structuralPattern.proxy;

import org.junit.jupiter.api.Test;

/**
 * @author jl.yao
 * @className Client
 * @description
 * @date 2021/12/2 10:30
 **/
public class Client {
    @Test
    public void test() {
        ProxyPoint pp = new ProxyPoint();
        pp.sell();
    }

    @Test
    public void test2() {
        ProxyFactory factory = new ProxyFactory();
        SellTickets  sellTickets = factory.getProxyObject();
        sellTickets.sell();
    }
}
