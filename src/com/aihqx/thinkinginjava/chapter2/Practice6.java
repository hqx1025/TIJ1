package com.aihqx.thinkinginjava.chapter2;

/**
 * @author huqingxiang
 * @date 2018/2/5 下午10:41
 */
public class Practice6 {
    int storage(String s){
        return s.length()*2;
    }
    public static void main(String[] args) {
        Practice6 p6 = new Practice6();
        System.out.println(p6.storage("H"));
    }
}
