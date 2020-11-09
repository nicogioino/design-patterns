package strategy;

public class StrategyMain {

    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal bird = new Animal();

        DogSound dogSound = new DogSound();
        BirdSound birdSound = new BirdSound();

        dog.setSoundBehavior(dogSound);
        bird.setSoundBehavior(birdSound);

        bird.getSound();
        dog.getSound();
    }
}
