package ro.mycode.duck.types;

import ro.mycode.duck.Duck;
import ro.mycode.duck.interfaceDuck.fly.FlyBehavior;
import ro.mycode.duck.interfaceDuck.fly.FlyWithWings;
import ro.mycode.duck.interfaceDuck.quack.Quack;
import ro.mycode.duck.interfaceDuck.quack.QuackBehavior;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior=new FlyWithWings();
    }

    public void display(){
        System.out.println("Sunt rata Mallard");
    }


}
