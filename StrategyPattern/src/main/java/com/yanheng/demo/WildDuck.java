package com.yanheng.demo;

public class WildDuck extends Duck {
    FlyBehavior flyBehavior;

    public WildDuck(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    @Override
    void fly(){
        System.out.println("Good fly");
    }
}
