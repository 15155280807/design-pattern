package com.example.demo.behavioralPattern.chainOfResponsibility;

/**
 * @author jl.yao
 * @className GeneralManager
 * @description
 * @date 2021/12/7 13:48
 **/
public class GeneralManager extends Handler{
    public GeneralManager() {
        //部门经理处理7天以上的请假
        super(Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("总经理审批：同意。");
    }
}
