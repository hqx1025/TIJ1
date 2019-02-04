package com.aihqx.thinkinginjava.chapter3;

import java.util.Random;

/**
 * @author huqingxiang
 * @date 2018/2/7 下午2:13
 */
public class Practice7 {
    public void throwCoins(){
        Random r = new Random();
        int result = r.nextInt(2);
        switch (result){
            case 0:
                System.out.println("正面");
                break;
            case 1:
                System.out.println("反面");
                break;
                default:
                    System.out.println("哇，硬币站立住了");
        }

    }

    public static void main(String[] args) {
        Practice7 p = new Practice7();
        p.throwCoins();
    }

}
