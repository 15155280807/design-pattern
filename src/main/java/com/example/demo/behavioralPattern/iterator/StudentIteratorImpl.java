package com.example.demo.behavioralPattern.iterator;

import com.example.demo.behavioralPattern.iterator.StudentIterator;
import com.example.demo.createPattern.prototype.Student;

import java.util.List;

/**
 * @author jl.yao
 * @className StudentIteratorImpl
 * @description
 * @date 2021/12/7 14:47
 **/
public class StudentIteratorImpl implements StudentIterator {
    private List<Student> list;
    private int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        Student currentStudent = list.get(position);
        position ++;
        return currentStudent;
    }
}
