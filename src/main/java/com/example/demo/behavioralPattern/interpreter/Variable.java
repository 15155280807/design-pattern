package com.example.demo.behavioralPattern.interpreter;

/**
 * @author jl.yao
 * @className Variable
 * @description
 * @date 2021/12/7 15:10
 **/
public class Variable extends AbstractExpression{
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context ctx) {
        return ctx.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
