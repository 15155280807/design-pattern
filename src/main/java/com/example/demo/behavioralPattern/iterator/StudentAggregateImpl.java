package com.example.demo.behavioralPattern.iterator;

import com.example.demo.createPattern.prototype.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jl.yao
 * @className StudentAggregateImpl
 * @description
 * @date 2021/12/7 14:53
 **/
public class StudentAggregateImpl implements StudentAggregate{

    private List<Student> list = new ArrayList<Student>();  // 学生列表

    @Override
    public void addStudent(Student student) {
        this.list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        this.list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
