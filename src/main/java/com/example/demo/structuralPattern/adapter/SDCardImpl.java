package com.example.demo.structuralPattern.adapter;

/**
 * @author jl.yao
 * @className SDCardImpl
 * @description
 * @date 2021/12/2 11:21
 **/
public class SDCardImpl implements SDCard{
    @Override
    public String readSd() {
       return  "sd card read a msg :hello word SD";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("sd card write msg : " + msg);
    }
}
