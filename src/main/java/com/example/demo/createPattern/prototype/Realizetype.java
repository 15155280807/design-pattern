package com.example.demo.createPattern.prototype;

/**
 * @author jl.yao
 * @className Realizetype
 * @description
 * @date 2021/12/1 19:31
 **/
public class Realizetype implements Cloneable{

    public Realizetype() {
        System.out.println("具体的原型对象创建完成！");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}
