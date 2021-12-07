package com.example.demo.behavioralPattern.iterator;

import com.example.demo.createPattern.prototype.Student;

/**
 * @author jl.yao
 * @className StudentAggregate
 * @description
 * @date 2021/12/7 14:48
 **/
public interface StudentAggregate {
    void addStudent(Student student);

    void removeStudent(Student student);

    StudentIterator getStudentIterator();
}
