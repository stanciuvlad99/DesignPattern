package ro.mycode.duck.interfaceDuck.fly;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly(){
        System.out.println("Rata nu zboara");
    }
}
