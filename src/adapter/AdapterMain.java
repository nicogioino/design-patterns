package adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterMain {
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        Pigeon pigeon = new Pigeon();
        ToyDuck toyDuck = new ToyDuck();

        birds.add(pigeon);
        birds.add(new ToyDuckAdapter(toyDuck));

        for (Bird b : birds) {
            b.makeSound();
            b.fly();
        }
    }
}
