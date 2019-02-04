package com.aihqx.thinkinginjava.chapter4;

/**
 * @author huqingxiang
 * @date 2018/2/7 下午4:45
 */
public class Prime {
    public void primeNum(int a){
        if (a == 1 || a == 2) {
            System.out.println("yes");
            return;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println("no");
                return;
            }else {
                System.out.println("yes");
                return;
            }
        }
    }

    public static void main(String[] args) {
        Prime p = new Prime();
        p.primeNum(1);
        p.primeNum(2);
        p.primeNum(3);
        p.primeNum(20);
    }
}
