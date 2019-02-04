package com.aihqx.thinkinginjava.chapter5;

/**
 * @author huqingxiang
 * @date 2018/2/8 下午9:27
 */
public class Practice17 {
    public Practice17(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        Practice17[] p = new Practice17[1];
        p[0] = new Practice17("hi");
    }
}
