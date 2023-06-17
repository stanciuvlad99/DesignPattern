package ro.mycode.duck.interfaceDuck.quack;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Rata macane");
    }
}
