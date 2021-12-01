package com.example.demo.prototype.原型模式;

/**
 * @author jl.yao
 * @className Student
 * @description
 * @date 2021/12/1 19:44
 **/
public class Student {
    private String name;
    private String address;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
