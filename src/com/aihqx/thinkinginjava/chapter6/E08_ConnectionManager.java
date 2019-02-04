package com.aihqx.thinkinginjava.chapter6;

/**
 * @author huqingxiang
 * @date 2018/2/9 下午3:52
 */
public class E08_ConnectionManager {
    public static void main(String[] args) {
        Connection c = ConnectionManager.getConnection();
        while(c != null) {
            System.out.println(c);
            c.doSomething();
            c = ConnectionManager.getConnection();
        } }
}
