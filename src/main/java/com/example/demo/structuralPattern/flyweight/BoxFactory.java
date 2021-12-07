package com.example.demo.structuralPattern.flyweight;

import java.util.HashMap;

/**
 * @author jl.yao
 * @className BoxFactory
 * @description
 * @date 2021/12/7 10:38
 **/
public class BoxFactory {
    private static HashMap<String, AbstractBox> map;

    private BoxFactory() {
        map = new HashMap<String, AbstractBox>();
        AbstractBox iBox = new IBox();
        AbstractBox lBox = new LBox();
        AbstractBox oBox = new OBox();
        map.put("I", iBox);
        map.put("L", lBox);
        map.put("O", oBox);
    }

    //单例静态内部类方式 -- 懒汉式
    public static final BoxFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final BoxFactory INSTANCE = new BoxFactory();
    }

    public AbstractBox getBox(String key) {
        return map.get(key);
    }
}
