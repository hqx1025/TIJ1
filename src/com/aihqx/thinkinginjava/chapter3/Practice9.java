package com.aihqx.thinkinginjava.chapter3;

/**
 * @author huqingxiang
 * @date 2018/2/7 下午3:33
 */
public class Practice9 {
    public static void main(String[] args) {
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        int hex = 0x100;
        System.out.println(Integer.toBinaryString(hex));
        System.out.println(Integer.toBinaryString(hex>>6));
        int a = 0xff;
        System.out.println(Integer.toBinaryString(a<<1));
        System.out.println(Integer.toBinaryString(a>>>4));
        Practice9 p = new Practice9();
        p.binaryChar('a');
        p.binaryChar('b');
    }
    public void binaryChar(char a){
        int b = a;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(b);
    }
}
