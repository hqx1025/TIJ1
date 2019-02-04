package com.aihqx.thinkinginjava.chapter4;

import java.util.Scanner;

/**
 * @author huqingxiang
 * @date 2018/2/7 下午7:24
 */
public class Fibonacci {
    public static int fn(int n){
        if (n <= 2) {
            return 1;
        }
        return fn(n-1) + fn(n-2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(fn(i)+",");
        }
    }
}
