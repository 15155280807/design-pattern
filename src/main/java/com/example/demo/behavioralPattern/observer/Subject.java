package com.example.demo.behavioralPattern.observer;

/**
 * @author jl.yao
 * @className Subject
 * @description
 * @date 2021/12/7 14:11
 **/
public interface Subject {
    //增加订阅者
    void attach(Observer observer);

    //删除订阅者
    void detach(Observer observer);

    //通知订阅者更新消息
    void notify(String message);
}
