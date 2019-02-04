package com.aihqx.mytest;

/**
 * @Descrption:
 * @Author: huqingxiang
 * @Date: 2019-01-17 14:47
 */
public class InitClassChild extends InitClassFather {
    static{
        System.out.println("子类静态加载");
    }
    String s = "子类实例变量初始化";
    public InitClassChild(String s) {
        System.out.println(this.s);
        this.s = s;
        System.out.println(s);
    }
    public void fun(){}
    public static void main(String[] args) {
        InitClassChild c = new InitClassChild("调用子类构造器");
        InitClassFather f = new InitClassChild("调用子类构造器");
        ((InitClassChild) f).fun();

    }
}
