package com.aihqx.thinkinginjava.chapter8;

import java.util.Random;

/**
 * @author huqingxiang
 * @date 2018/2/10 下午4:13
 */
class Instrument {
    void play(Note n) { System.out.println("Instrument.play() " + n); }
    @Override
    public String toString() { return "Instrument"; }
    void adjust() {}
}
class Wind extends Instrument {
    @Override
    void play(Note n) { System.out.println("Wind.play() " + n); }
    @Override
    public String toString () { return "Wind"; }
}
class Percussion extends Instrument {
    @Override
    void play(Note n) { System.out.println("Percussion.play() " + n); }
    @Override
    public String toString () { return "Percussion"; }
}
class Stringed extends Instrument {
    @Override
    void play(Note n) { System.out.println("Stringed.play() " + n); }
    @Override
    public String toString () { return "Stringed"; }
}
class Brass extends Wind {
    @Override
    void play(Note n) { System.out.println("Brass.play() " + n); }
    @Override
    void adjust() { System.out.println("Brass.adjust()"); }
}
class Woodwind extends Wind {
    @Override
    void play(Note n) { System.out.println("Woodwind.play() " + n); }
    @Override
    public String toString () { return "Woodwind"; }
}
class Guitar extends Instrument{
    @Override
    void play(Note n) {
        System.out.println("Guitar.play() " + n);
    }

    @Override
    public String toString() {
        return "Guitar";
    }
}
public class Practice6 {
    public static Instrument getInst(){
        Random r = new Random();

        switch (r.nextInt(6)) {
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Brass();
            case 4: return new Woodwind();
            case 5: return new Guitar();
            default:return null;
        }
    }
    public static Instrument[] initInst(Instrument[] orch){
        for (int i = 0; i < orch.length; i++) {
            orch[i] = getInst();
        }
        return orch;
    }

    public static void printAll(Instrument[] orch) {
        for (Instrument i : orch) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        printAll(initInst(new Instrument[10]));
    }
}

enum Note{
    MIDDLE_C,C_SHARP,B_FLAT;
}