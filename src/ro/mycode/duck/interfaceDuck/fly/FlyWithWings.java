package ro.mycode.duck.interfaceDuck.fly;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly(){
        System.out.println("Rata zboara");
    }
}
