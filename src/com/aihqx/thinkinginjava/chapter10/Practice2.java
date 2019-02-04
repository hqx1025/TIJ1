package com.aihqx.thinkinginjava.chapter10;

/**
 * @author huqingxiang
 * @date 2018/2/15 下午2:04
 */
public class Practice2 {
    String str;
    class Inner{
        Inner(){
            System.out.println("inner");
        }
    }
    @Override
    public String toString() {
        return str;
    }
}
