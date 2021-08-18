package com.yanheng.demo;

public class Main {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck(new GoodFlyBehavior());
        PekingDuck pekingDuck = new PekingDuck(new BadFlyBehavior());
        wildDuck.fly();
        pekingDuck.fly();
    }
}
