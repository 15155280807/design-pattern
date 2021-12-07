package com.example.demo.behavioralPattern.mediator;

import org.junit.jupiter.api.Test;

/**
 * @author jl.yao
 * @className Client
 * @description
 * @date 2021/12/7 14:42
 **/
public class Client {
    @Test
    public void test() {
        //一个房主、一个租房者、一个中介机构
        MediatorStructure mediator = new MediatorStructure();

        //房主和租房者只需要知道中介机构即可
        HouseOwner houseOwner = new HouseOwner("张三", mediator);
        Tenant tenant = new Tenant("李四", mediator);

        //中介结构要知道房主和租房者
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.constact("需要租三室的房子");
        houseOwner.constact("我这有三室的房子，你需要租吗？");
    }
}
