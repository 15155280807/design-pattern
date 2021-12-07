package com.example.demo.behavioralPattern.state;

import org.junit.jupiter.api.Test;

/**
 * @author jl.yao
 * @className Client
 * @description
 * @date 2021/12/7 13:59
 **/
public class Client {

    @Test
    public void test() {
        Context context = new Context();
        context.setLiftState(new ClosingState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
