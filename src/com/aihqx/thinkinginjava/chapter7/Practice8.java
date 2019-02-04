package com.aihqx.thinkinginjava.chapter7;

/**
 * @author huqingxiang
 * @date 2018/2/9 下午5:31
 */
public class Practice8 {
    public static void main(String[] args) {
        Son s = new Son();
        Son s1 = new Son("1");
    }

}
class Father{
    Father(String s){
        System.out.println(s);
    }
}
class Son extends Father{
    Son(){
        super("");
    }
    Son(String s){
        super("");
        System.out.println(s);

    }
}