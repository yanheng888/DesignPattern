package com.yanheng.demo;

public class PekingDuck extends Duck {
    FlyBehavior flyBehavior;

    public PekingDuck(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    @Override
    void fly() {
        flyBehavior.fly();
    }
}
