package com.example.demo.behavioralPattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jl.yao
 * @className Home
 * @description
 * @date 2021/12/7 15:02
 **/
public class Home {

    private List<Animal> nodeList = new ArrayList<Animal>();

    public void action(Person person) {
        for (Animal node : nodeList) {
            node.accept(person);
        }
    }

    //添加操作
    public void add(Animal animal) {
        nodeList.add(animal);
    }
}
