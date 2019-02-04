package com.aihqx.thinkinginjava.chapter5;

/**
 * @author huqingxiang
 * @date 2018/2/8 下午10:18
 */
public class Practice19 {

    public static void test(String... args){
        for (String s:args) {
            System.out.println(s);
        }
    }

    public static void main(String... args) {
        test("111","222");
        test();
        test(new String[]{"333"});
        if (args.length > 0) {
            for (String s:args) {
                System.out.println(s);
            }
            System.out.println();
        }
    }
}
