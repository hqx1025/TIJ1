package com.aihqx.mytest;

/**
 * @Descrption:
 * @Author: huqingxiang
 * @Date: 2019-01-17 14:46
 */
public class InitClassFather {
    static{
        System.out.println("父类静态加载");
    }
    int a;
    String s = "父类实例变量初始化";
    public InitClassFather() {
        System.out.println(s);
        s = "调用父类构造器";
        System.out.println(s);
    }
}
