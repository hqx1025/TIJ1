package com.aihqx.thinkinginjava.chapter7;

/**
 * @author huqingxiang
 * @date 2018/2/9 下午4:11
 */
public class Practice1 {

    public static void main(String[] args) {
        Test t = null;
        if (t == null) {
            t = new Test();
        }
        System.out.println(t.str);
    }
}
class Test{
    String str = "abc";
    Test(){
        str = "aaa";
    }
}