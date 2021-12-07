package com.example.demo.behavioralPattern.interpreter;

/**
 * @author jl.yao
 * @className Minus
 * @description
 * @date 2021/12/7 15:10
 **/
public class Minus extends AbstractExpression{
    private AbstractExpression left;
    private AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }

}
