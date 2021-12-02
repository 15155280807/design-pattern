package com.example.demo.structuralPattern.adapter;

/**
 * @author jl.yao
 * @className Computer
 * @description
 * @date 2021/12/2 11:22
 **/
public class Computer {

    public String readSD(SDCard sdCard){
        if (sdCard == null){
            throw new NullPointerException("sd card null");
        }
        return sdCard.readSd();
    }
}
