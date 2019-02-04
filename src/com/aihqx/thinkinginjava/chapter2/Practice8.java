package com.aihqx.thinkinginjava.chapter2;

/**
 * @author huqingxiang
 * @date 2018/2/5 下午11:23
 */
public class Practice8 {
    static int a = 1;

    public static void main(String[] args) {
        Practice8 p8_1 = new Practice8();
        p8_1.a=2;
        Practice8 p8_2 = new Practice8();
        System.out.println(p8_2.a);
        Practice8 p8_3 = new Practice8();
        System.out.println(p8_3.a);

    }
}
