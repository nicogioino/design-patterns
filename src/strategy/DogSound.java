package strategy;

public class DogSound implements SoundBehavior{
    @Override
    public void makeSound() {
        System.out.println("Dog Sound!");
    }
}
