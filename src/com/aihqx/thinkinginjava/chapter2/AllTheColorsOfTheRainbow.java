package com.aihqx.thinkinginjava.chapter2;

/**
 * @author huqingxiang
 * @date 2018/2/6 上午12:24
 */
public class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
    }
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow all =
                new AllTheColorsOfTheRainbow();
        all.changeTheHueOfTheColor(27);
    }
}
