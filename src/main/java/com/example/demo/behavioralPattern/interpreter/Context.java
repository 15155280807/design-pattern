package com.example.demo.behavioralPattern.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jl.yao
 * @className Context
 * @description
 * @date 2021/12/7 15:10
 **/
public class Context {
    private Map<Variable, Integer> map = new HashMap<Variable, Integer>();

    public void assign(Variable var, Integer value) {
        map.put(var, value);
    }

    public int getValue(Variable var) {
        Integer value = map.get(var);
        return value;
    }
}
