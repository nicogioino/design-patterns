package command;

public class TurnTvOff implements Command {

    ElectronicDevice electronicDevice;

    public TurnTvOff(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.off();
    }
}
