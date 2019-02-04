package com.aihqx.thinkinginjava.chapter9;

/**
 * @author huqingxiang
 * @date 2018/2/11 下午4:29
 */
public interface Cycle {

}
class Unicycle implements Cycle{}
class Bicycle implements Cycle{}
class Tricycle implements Cycle{}

interface CycleFactory{
    Cycle getCycle();
}

class UnicycleFactoryImpl implements CycleFactory{
    @Override
    public Unicycle getCycle() {
        return new Unicycle();
    }
}
class BicycleFactoryImpl implements CycleFactory{
    @Override
    public Bicycle getCycle() {
        return new Bicycle();
    }
}
class TricycleFactoryImpl implements CycleFactory{
    @Override
    public Tricycle getCycle() {
        return new Tricycle();
    }
}