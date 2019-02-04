package com.aihqx.thinkinginjava.chapter10;


/**
 * @author huqingxiang
 * @date 2018/2/15 下午2:07
 */
public class Practice5 {
    void f(){
        Practice2 p = new Practice2();
        p.new Inner();
    }
    static void f1(){
        Practice2 p = new Practice2();
        p.new Inner();
    }
    public static void main(String[] args) {
        Practice2 p = new Practice2();
        p.new Inner();

    }
}
