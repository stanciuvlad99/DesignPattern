package ro.mycode.duck.types;

import ro.mycode.duck.Duck;
import ro.mycode.duck.interfaceDuck.quack.QuackBehavior;

public class RubberDuck extends Duck implements QuackBehavior {

    @Override
    public void display(){
        System.out.println("Rata de cauciuc chitaie");
    }

}
