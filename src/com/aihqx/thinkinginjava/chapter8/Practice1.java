package com.aihqx.thinkinginjava.chapter8;

/**
 * @author huqingxiang
 * @date 2018/2/10 下午2:58
 */
public class Practice1 {
    public void ride(Cycle c){
        System.out.println(c.wheels());
    }

    public static void main(String[] args) {
        Practice1 p = new Practice1();
        p.ride(new Unicycle());
        p.ride(new Bicycle());
        p.ride(new Tricycle());
    }
}
class Cycle{
    public int wheels(){
        return 0;
    }
}

class Unicycle extends Cycle{
    @Override
    public int wheels(){
        return 1;
    }
}
class Bicycle extends Cycle{
    @Override
    public int wheels(){
        return 2;
    }
}
class Tricycle extends Cycle{
    @Override
    public int wheels(){
        return 3;
    }
}