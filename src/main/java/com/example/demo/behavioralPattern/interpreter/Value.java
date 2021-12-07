package com.example.demo.behavioralPattern.interpreter;

/**
 * @author jl.yao
 * @className Value
 * @description
 * @date 2021/12/7 15:09
 **/
public class Value extends AbstractExpression{

    private int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return value;
    }

    @Override
    public String toString() {
        return new Integer(value).toString();
    }
}
