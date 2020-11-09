package strategy;

public class Animal {

    String name;
    String sound;
    SoundBehavior soundBehavior;
    FlyBehavior flyBehavior;

    public void getSound(){
        soundBehavior.makeSound();
    }


    public SoundBehavior getSoundBehavior() {
        return soundBehavior;
    }

    public void setSoundBehavior(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public Animal() {
    }

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }
}
