package com.aihqx.thinkinginjava.chapter5;

/**
 * @author huqingxiang
 * @date 2018/2/8 下午10:30
 */
public class Practice21 {
    static void describe(RMB pct) {
        System.out.println(pct + " has a portrait of ");
        switch (pct) {
            case ONE:
                System.out.println("George Washington");
                break;
            case TWO:
                System.out.println("Thomas Jefferson");
                break;
            case FIVE:
                System.out.println("Abraham Lincoln");
                break;
            case TEN:
                System.out.println("Alexander Hamilton");
                break;
            case TWENTY:
                System.out.println("Andrew Jackson");
                break;
            case FIFTY:
                System.out.println("U.S. Grant");
                break;
        }
    }

    public static void main(String[] args) {
        for (RMB s : RMB.values()){
            describe(s);
    }
}
}
enum RMB{
    ONE,TWO,FIVE,TEN,TWENTY,FIFTY
}