package com.aihqx.thinkinginjava.chapter7;

/**
 * @author huqingxiang
 * @date 2018/2/9 下午5:35
 */
public class Root {
    Root(){
        System.out.println("Root");
    }
    Root(int i){
        System.out.println(i);
    }
    Component1 c1 = new Component1(1);
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();
}
class Component1{
    Component1(int i){
        System.out.println("Component1"+i);
    }
}
class Component2{
    Component2(){
        System.out.println("Component2");
    }
}
class Component3{
    Component3(){
        System.out.println("Component3");
    }
}
class Stem extends Root{
    Component1 c1 = new Component1(2);
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();
    Stem(){
        System.out.println("Stem");
    }
    Stem(int i){
        super(1);
        System.out.println(i);
    }
}
class TestStem{
    public static void main(String[] args) {
        new Stem(1);
    }
}