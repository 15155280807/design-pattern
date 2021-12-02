package com.example.demo.structuralPattern.adapter;

/**
 * @author jl.yao
 * @className TFCardImpl
 * @description
 * @date 2021/12/2 11:23
 **/
public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        String msg ="tf card read msg : hello word tf card";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("tf card write a msg : " + msg);
    }
}
