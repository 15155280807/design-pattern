package com.example.demo.behavioralPattern.memento.黑箱备忘录;

/**
 * @author jl.yao
 * @className RoleStateCaretaker
 * @description
 * @date 2021/12/7 15:08
 **/
public class RoleStateCaretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
