package com.aihqx.thinkinginjava.chapter7;

/**
 * @author huqingxiang
 * @date 2018/2/9 下午6:07
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls s = new SpaceShipControls();
    public SpaceShipDelegation(String name){
        this.name = name;
    }
    public void up(int velocity) {
        s.up(velocity);
    }

    public void down(int velocity) {
        s.down(velocity);
    }

    public void left(int velocity) {
        s.left(velocity);
    }

    public void right(int velocity) {
        s.right(velocity);
    }

    public void forward(int velocity) {
        s.forward(velocity);
    }

    public void back(int velocity) {
        s.back(velocity);
    }

    public void turboBoost(int velocity) {
        s.turboBoost(velocity);
    }

    public void addNewFunc(){}

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("NSEA protector");
        protector.forward(100);
    }
}
