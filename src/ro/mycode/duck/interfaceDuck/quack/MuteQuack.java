package ro.mycode.duck.interfaceDuck.quack;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Rata nu scoate niciun zgomot");
    }
}
