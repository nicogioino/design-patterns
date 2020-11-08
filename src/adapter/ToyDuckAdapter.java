package adapter;

public class ToyDuckAdapter implements Bird {
    ToyDuck toyDuck;

    public ToyDuckAdapter(ToyDuck toyDuck) {
        this.toyDuck = toyDuck;
    }

    @Override
    public void makeSound() {
        toyDuck.squeak();

    }

    @Override
    public void fly() {
        toyDuck.throwDuck();
    }
}
