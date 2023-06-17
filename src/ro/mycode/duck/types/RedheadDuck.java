package ro.mycode.duck.types;

import ro.mycode.duck.Duck;
import ro.mycode.duck.interfaceDuck.fly.FlyBehavior;
import ro.mycode.duck.interfaceDuck.quack.QuackBehavior;

public class RedheadDuck extends Duck implements FlyBehavior, QuackBehavior {

    @Override
    public void display(){
        System.out.println("Sunt rata Redhead");
    }

}
