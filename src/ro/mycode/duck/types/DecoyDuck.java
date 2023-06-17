package ro.mycode.duck.types;

import ro.mycode.duck.Duck;
import ro.mycode.duck.interfaceDuck.fly.FlyBehavior;
import ro.mycode.duck.interfaceDuck.fly.FlyNoWay;

public class DecoyDuck extends Duck implements FlyBehavior {

    @Override
    public void display() {
        System.out.println("Sunt o rata Decoy");
    }

}
