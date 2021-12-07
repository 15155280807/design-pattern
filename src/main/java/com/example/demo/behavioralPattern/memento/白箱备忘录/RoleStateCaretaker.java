package com.example.demo.behavioralPattern.memento.白箱备忘录;

/**
 * @author jl.yao
 * @className RoleStateCaretaker
 * @description
 * @date 2021/12/7 15:07
 **/
//角色状态管理者类
public class RoleStateCaretaker {
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
