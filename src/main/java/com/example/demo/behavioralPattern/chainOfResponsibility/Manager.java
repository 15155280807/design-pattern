package com.example.demo.behavioralPattern.chainOfResponsibility;

/**
 * @author jl.yao
 * @className Manager
 * @description
 * @date 2021/12/7 13:47
 **/
public class Manager extends Handler{
    public Manager() {
        //部门经理处理3-7天的请假
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("部门经理审批：同意。");
    }
}
