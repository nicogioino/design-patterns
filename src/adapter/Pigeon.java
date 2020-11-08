package adapter;

public class Pigeon implements Bird {
    @Override
    public void makeSound() {
        System.out.println("Piu piu");

    }

    @Override
    public void fly() {
        System.out.println("Pigeon is flying");

    }
}
