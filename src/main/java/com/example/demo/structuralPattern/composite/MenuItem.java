package com.example.demo.structuralPattern.composite;

/**
 * @author jl.yao
 * @className MenuItem
 * @description
 * @date 2021/12/7 10:29
 **/
public class MenuItem extends MenuComponent {
    public MenuItem(String name,int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 1; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
