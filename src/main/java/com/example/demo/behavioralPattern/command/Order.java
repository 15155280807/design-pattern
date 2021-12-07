package com.example.demo.behavioralPattern.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jl.yao
 * @className Order
 * @description
 * @date 2021/12/7 11:25
 **/
public class Order {
    // 餐桌号码
    private int diningTable;

    // 用来存储餐名并记录份数
    private Map<String, Integer> foodDic = new HashMap<String, Integer>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDic() {
        return foodDic;
    }

    public void setFoodDic(String name, int num) {
        foodDic.put(name,num);
    }
}
