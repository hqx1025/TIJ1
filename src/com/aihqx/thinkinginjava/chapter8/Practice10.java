package com.aihqx.thinkinginjava.chapter8;

/**
 * @author huqingxiang
 * @date 2018/2/10 下午5:17
 */
public class Practice10 {
    public static void main(String[] args) {
        F f = new S();
        f.f1();
    }
}

class F{
    void f1(){
        f2();
    }
    void f2(){
        System.out.println(" F f2");
    }
}

class S extends F{
    @Override
    void f2(){
        System.out.println("S f2");
    }
}