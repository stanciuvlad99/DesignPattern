package ro.mycode.duck;

import ro.mycode.duck.interfaceDuck.fly.FlyBehavior;
import ro.mycode.duck.interfaceDuck.fly.FlyNoWay;
import ro.mycode.duck.interfaceDuck.quack.QuackBehavior;

public  abstract class Duck {

    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;
    public Duck(){}

    public void display(){
        System.out.println("sunt o rata");
    }

    public void performQuack(){
        this.quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb){
        this.flyBehavior=fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        this.quackBehavior=qb;
    }
    public void performFly(){
        this.flyBehavior.fly();
    }

    public void swim(){
        System.out.println("rata inoata");
    }


}
