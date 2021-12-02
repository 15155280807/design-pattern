package com.example.demo.structuralPattern.bridging;

import org.junit.jupiter.api.Test;

/**
 * @author jl.yao
 * @className Client
 * @description
 * @date 2021/12/2 14:08
 **/
public class Client {
    @Test
    public void test() {
        OperatingSystemVersion os = new Windows(new AVIFile());
        os.play("战狼3");
    }
}
