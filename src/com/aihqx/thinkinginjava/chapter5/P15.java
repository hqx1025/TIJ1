package com.aihqx.thinkinginjava.chapter5;

/**
 * @Descrption:
 * @Author: huqingxiang
 * @Date: 2019-01-17 15:37
 */
public class P15 {
    String s;
   {s = "非静态实例初始化";}


    public static void main(String[] args) {
        P15 p = new P15();
        System.out.println(p.s);
    }
}
