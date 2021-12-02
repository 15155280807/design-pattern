package com.example.demo.structuralPattern.adapter;

/**
 * @author jl.yao
 * @className SDAdapterTF
 * @description
 * @date 2021/12/2 11:23
 **/
public class SDAdapterTF  implements SDCard{
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }
    @Override
    public String readSd() {
        System.out.println("adapter read tf card ");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
