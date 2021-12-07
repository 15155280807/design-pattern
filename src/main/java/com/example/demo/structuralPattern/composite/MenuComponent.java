package com.example.demo.structuralPattern.composite;

/**
 * @author jl.yao
 * @className MenuComponent
 * @description
 * @date 2021/12/7 10:12
 **/
//菜单组件  不管是菜单还是菜单项，都应该继承该类
public class MenuComponent {

    protected String name;
    protected int level;
    //添加菜单
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    //移除菜单
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    //获取指定的子菜单
    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    //获取菜单名称
    public String getName(){
        return name;
    }

    public void print(){
        throw new UnsupportedOperationException();
    }
}
