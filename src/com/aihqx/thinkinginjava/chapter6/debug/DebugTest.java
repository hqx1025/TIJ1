package com.aihqx.thinkinginjava.chapter6.debug;

import java.util.Scanner;

/**
 * @author huqingxiang
 * @date 2018/2/9 下午2:55
 */
public class DebugTest {
    public void debug(){
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}
