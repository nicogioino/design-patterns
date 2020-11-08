package command;

public class Television implements ElectronicDevice{
    int volume = 0;
    @Override
    public void on() {
        System.out.println("Tv is on");
    }

    @Override
    public void off() {
        System.out.println("Tv is off");
    }

    @Override
    public void volumeUp() {
        volume ++;
        System.out.println("Volume is " + volume);
    }

    @Override
    public void volumeDown() {
        volume --;
        System.out.println("Volume is " + volume);
    }
}
