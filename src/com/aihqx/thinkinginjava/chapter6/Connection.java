package com.aihqx.thinkinginjava.chapter6;

/**
 * @author huqingxiang
 * @date 2018/2/9 下午3:46
 */
public class Connection {
    private static int counter = 0;
    private int id = counter++;
    Connection() {}
    @Override
    public String toString() {
        return "Connection " + id;
    }
    public void doSomething() {}
}
