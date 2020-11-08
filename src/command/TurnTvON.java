package command;

public class TurnTvON implements Command {
    ElectronicDevice electronicDevice;

    public TurnTvON(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.on();
    }
}
