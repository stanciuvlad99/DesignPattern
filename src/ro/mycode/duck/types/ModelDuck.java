package ro.mycode.duck.types;

import ro.mycode.duck.Duck;
import ro.mycode.duck.interfaceDuck.fly.FlyNoWay;
import ro.mycode.duck.interfaceDuck.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quack();
    }

    public void dosplay(){
        System.out.println("Sunt o rata model");
    }
}
