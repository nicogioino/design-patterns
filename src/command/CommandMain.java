package command;

public class CommandMain {
    public static void main(String[] args) {
        ElectronicDevice electronicDevice = TvRemote.getDevice();


        TurnTvON turnTvON = new TurnTvON(electronicDevice);
        TurnTvOff turnTvOff = new TurnTvOff(electronicDevice);

        DeviceButton turnOnButton = new DeviceButton(turnTvON);
        DeviceButton turnOffButton = new DeviceButton(turnTvOff);

        turnOnButton.press();
        turnOffButton.press();



    }
}
