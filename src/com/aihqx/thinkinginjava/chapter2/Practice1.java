package com.aihqx.thinkinginjava.chapter2;
/**
 * @author huqingxiang
 * @date 2018/1/29 下午5:57
 */
public class Practice1 {
    int a;
    char b;

    public void print(){
        System.out.println(a);
        System.out.println("[" + b + "]");
    }
    public static void main(String[] args){
        Practice1 p = new Practice1();
        p.print();
    }
}
