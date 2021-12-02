package com.example.demo.createPattern.prototype;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author jl.yao
 * @className CitationTest
 * @description
 * @date 2021/12/1 19:37
 **/
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation c1 = new Citation();
        c1.setName("张三");

        //复制奖状
        Citation c2 = c1.clone();
        //将奖状的名字修改李四
        c2.setName("李四");

        c1.show();
        c2.show();
        System.out.println("对象c1和c2是同一个对象？" + (c1 == c2));
    }

    /**
     *  stu对象和stu1对象是同一个对象，就会产生将stu1对象中name属性值改为“李四”，
     *  两个Citation（奖状）对象中显示的都是李四。这就是浅克隆的效果，对具体原型类（Citation）
     *  中的引用类型的属性进行引用的复制。
     * @throws CloneNotSupportedException
     * 浅克隆
     */
    @Test
    public void test() throws CloneNotSupportedException {

        Citation2 c1 = new Citation2();
        Student stu = new Student("张三", "西安");
        c1.setStu(stu);

        //复制奖状
        Citation2 c2 = c1.clone();
        //获取c2奖状所属学生对象
        Student stu1 = c2.getStu();
        stu1.setName("李四");

        //判断stu对象和stu1对象是否是同一个对象
        System.out.println("stu和stu1是同一个对象？" + (stu == stu1));

        c1.show();
        c2.show();
    }

    /**
     * 深克隆
     * @throws CloneNotSupportedException
     */
    @Test
    public void tes2t() throws Exception {

        Citation2 c1 = new Citation2();
        Student stu = new Student("张三", "西安");
        c1.setStu(stu);

        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Think\\Desktop\\b.txt"));
        //将c1对象写出到文件中
        oos.writeObject(c1);
        oos.close();

        //创建对象出入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Think\\Desktop\\b.txt"));
        //读取对象
        Citation2 c2 = (Citation2) ois.readObject();
        //获取c2奖状所属学生对象
        Student stu1 = c2.getStu();
        stu1.setName("李四");

        //判断stu对象和stu1对象是否是同一个对象
        System.out.println("stu和stu1是同一个对象？" + (stu == stu1));

        c1.show();
        c2.show();
    }



}
