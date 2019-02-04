package com.aihqx.thinkinginjava.chapter3;

/**
 * @author huqingxiang
 * @date 2018/2/7 下午4:13
 */
public class Practice14 {
    public void compareStr(String a,String b){
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a.equals(b));
    }

    public static void main(String[] args) {
        Practice14 p = new Practice14();
        p.compareStr("aa","bb");
        p.compareStr("abc","abc");
    }
}
