package com.aihqx.thinkinginjava.chapter3;

/**
 * @author huqingxiang
 * @date 2018/2/7 下午12:56
 */
public class Practice2 {
    public static void main(String[] args) {
        MyFloat mf1 = new MyFloat();
        MyFloat mf2 = new MyFloat();
        mf1.f = 0.1f;
        mf2.f = 1.1f;
        mf1 = mf2;
        mf1.f = 2.2f;
        System.out.println(mf2.f);
    }
}
class MyFloat{
    float f;
}