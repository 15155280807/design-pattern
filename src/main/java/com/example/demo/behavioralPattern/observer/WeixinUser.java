package com.example.demo.behavioralPattern.observer;

/**
 * @author jl.yao
 * @className WeixinUser
 * @description
 * @date 2021/12/7 14:10
 **/
public class WeixinUser implements Observer{
    // 微信用户名
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
