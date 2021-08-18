package com.yanheng.demo;

public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Bad fly");
    }
}
