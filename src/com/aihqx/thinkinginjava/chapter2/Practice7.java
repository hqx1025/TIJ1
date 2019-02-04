package com.aihqx.thinkinginjava.chapter2;

/**
 * @author huqingxiang
 * @date 2018/2/5 下午10:56
 */
public class Practice7 {
    static void increment(){
        StaticTest.i++;
    }
    public static void main(String[] args) {
        Practice7 p7 = new Practice7();
        p7.increment();
        Practice7.increment();
        System.out.println(StaticTest.i);
    }
}
class StaticTest{
    static int i = 47;
}
