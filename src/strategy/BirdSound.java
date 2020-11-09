package strategy;

public class BirdSound implements SoundBehavior{
    @Override
    public void makeSound() {
        System.out.println("Bird Sound!");
    }
}
