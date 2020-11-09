package strategy;

public class Fly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
