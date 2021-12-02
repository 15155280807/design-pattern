package com.example.demo.createPattern.prototype;

/**
 * @author jl.yao
 * @className Citation2
 * @description
 * @date 2021/12/1 19:43
 **/
//奖状类
public class Citation2 implements Cloneable {
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    void show() {
        System.out.println(stu.getName() + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public Citation2 clone() throws CloneNotSupportedException {
        return (Citation2) super.clone();
    }
}


