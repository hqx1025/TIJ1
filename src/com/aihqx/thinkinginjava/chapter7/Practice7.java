package com.aihqx.thinkinginjava.chapter7;

/**
 * @author huqingxiang
 * @date 2018/2/9 下午5:09
 */
public class Practice7 extends A{
    A a;
    B b;
    Practice7(String s){
        super("显示调用基类带参数构造方法");
        a = new A("初始化A");
        b = new B("初始化B");
    }

    public static void main(String[] args) {
        new Practice7("aa");
    }

}
class A{
    A(String a){
        System.out.println(a);
    }
}
class B{
    B(String b){
        System.out.println(b);
    }
}