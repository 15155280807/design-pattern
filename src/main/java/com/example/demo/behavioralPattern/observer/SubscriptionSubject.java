package com.example.demo.behavioralPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jl.yao
 * @className SubscriptionSubject
 * @description
 * @date 2021/12/7 14:11
 **/
public class SubscriptionSubject implements Subject{
    //储存订阅公众号的微信用户
    private List<Observer> weixinUserlist = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        weixinUserlist.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserlist.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weixinUserlist) {
            observer.update(message);
        }
    }
}
