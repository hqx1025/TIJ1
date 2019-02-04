package com.aihqx.thinkinginjava.chapter9;

/**
 * @author huqingxiang
 * @date 2018/2/10 下午10:38
 */
public class Practice2 {
//    Abs abs = new Abs();
    public static void main(String[] args) {
        Bbs bbs = new Bbs();
        bbs.print();
    }


}
abstract class Abs{
    public Abs() {
        print();
    }

    abstract void print();
}

class Bbs extends Abs{
    int a = 1;
    @Override
    void print() {
        System.out.println(a);
    }
}