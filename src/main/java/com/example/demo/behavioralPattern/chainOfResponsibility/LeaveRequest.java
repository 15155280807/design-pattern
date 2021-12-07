package com.example.demo.behavioralPattern.chainOfResponsibility;

/**
 * @author jl.yao
 * @className LeaveRequest
 * @description
 * @date 2021/12/7 13:45
 **/
public class LeaveRequest {
    private String name;//姓名
    private int num;//请假天数
    private String content;//请假内容

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
