package com.aihqx.thinkinginjava.chapter3;

/**
 * @author huqingxiang
 * @date 2018/2/7 下午1:59
 */
public class Practice5 {
    String name;
    String says;

    public static void main(String[] args) {
        Practice5 dog1 = new Practice5();
        Practice5 dog2 = new Practice5();
        Practice5 dog3 = dog1;
        dog1.name = "spot";
        dog1.says = "Ruff";
        dog2.name = "scruffy";
        dog2.name = new String("spot");
        dog2.says = "Wurf";
        System.out.println(dog1.name+" say:"+dog1.says);
        System.out.println(dog2.name+" say:"+dog2.says);
        System.out.println(dog3==dog1);
        System.out.println(dog3==dog2);
        System.out.println(dog3.equals(dog1));
        System.out.println(dog3.equals(dog2));
        System.out.println(dog1.name==dog2.name);

    }
}
