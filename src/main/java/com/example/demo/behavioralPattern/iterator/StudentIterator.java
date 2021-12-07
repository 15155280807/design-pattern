package com.example.demo.behavioralPattern.iterator;

import com.example.demo.createPattern.prototype.Student;

/**
 * @author jl.yao
 * @className StudentIterator
 * @description
 * @date 2021/12/7 14:47
 **/
public interface StudentIterator {
    boolean hasNext();
    Student next();
}
