package com.aihqx.mytest;

import com.aihqx.thinkinginjava.chapter6.Practice4;

/**
 * test something
 *
 * @author huqingxiang
 * @date 2018/1/30 下午8:46
 */
public class Test {
    int t = "abc".length();

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(100.0+"+");
        System.out.println(sb);
        System.out.println(sb.length());
        Practice4 p = new Practice4();

        int n = 2;
        System.out.println(Integer.toBinaryString(~n));
        int m = ~n+1;
        System.out.println(m);
        System.out.println(Integer.toBinaryString(m));

    }
}
