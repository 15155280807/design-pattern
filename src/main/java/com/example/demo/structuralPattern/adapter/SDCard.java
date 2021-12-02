package com.example.demo.structuralPattern.adapter;

/**
 * @author jl.yao
 * @className SDCard
 * @description
 * @date 2021/12/2 11:20
 **/
public interface SDCard {
    String readSd();
    void writeSD(String msg);
}
