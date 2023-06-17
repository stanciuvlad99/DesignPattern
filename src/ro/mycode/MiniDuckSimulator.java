package ro.mycode;

import ro.mycode.duck.Duck;
import ro.mycode.duck.interfaceDuck.fly.FlyRocketPowered;
import ro.mycode.duck.types.MallardDuck;
import ro.mycode.duck.types.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {

//        MallardDuck mallardDuck = new MallardDuck();
//        mallardDuck.performQuack();
//        mallardDuck.performFly();


        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}