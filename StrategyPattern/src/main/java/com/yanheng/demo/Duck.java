package com.yanheng.demo;

public abstract class Duck {
    FlyBehavior flyBehavior;
    void fly(){
        if(flyBehavior != null){
            flyBehavior.fly();
        }
    }
}
