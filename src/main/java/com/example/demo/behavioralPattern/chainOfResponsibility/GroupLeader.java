package com.example.demo.behavioralPattern.chainOfResponsibility;

/**
 * @author jl.yao
 * @className GroupLeader
 * @description
 * @date 2021/12/7 13:47
 **/
public class GroupLeader extends Handler{
    public GroupLeader() {
        //小组长处理1-3天的请假
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("小组长审批：同意。");
    }
}
