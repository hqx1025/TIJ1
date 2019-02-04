package com.aihqx.thinkinginjava.chapter8;

/**
 * @author huqingxiang
 * @date 2018/2/10 下午3:46
 */
public class Test {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.name);
        a.getName();

    }
}
class A{
    String name = "a";
    public String age = "0";
    public void getName(){
        System.out.println("a");
    }
}
class B extends A{
    String name = "b";
    @Override
    public void getName(){
        System.out.println("b");
    }
    public void bb(){
        System.out.println("only b");
    }
}