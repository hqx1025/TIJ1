package com.aihqx.thinkinginjava.chapter4;

import java.util.Random;

/**
 * @author huqingxiang
 * @date 2018/2/7 下午4:27
 */
public class Practice2 {
    public static void main(String[] args) {
            Random r = new Random();
            int beforeInt = r.nextInt(20);
            for (int i = 0; i < 24; i++) {
                int nextInt = r.nextInt(20);
                if (beforeInt > nextInt) {
                    System.out.println(beforeInt + "大于");
                } else if (beforeInt < nextInt) {
                    System.out.println(beforeInt + "小于");
                } else if (beforeInt == nextInt) {
                    System.out.println(beforeInt + "等于");
                }
                beforeInt = nextInt;
            }
    }
}
