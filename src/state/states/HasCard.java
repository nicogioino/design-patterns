package state.states;

import state.ATMMachine;
import state.ATMState;

public class HasCard implements ATMState {

    ATMMachine atmMachine;

    public HasCard(ATMMachine newATMMachine){
        atmMachine = newATMMachine;
    }
    @Override
    public void insertCard() {
        System.out.println("One card is already inserted");
    }

    @Override
    public void ejectCard() {
        System.out.println("card Ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pin) {
        if(pin == 1234){
            System.out.println("correct PIN");
            atmMachine.correctPinEntered = true;
            atmMachine.setATMState(atmMachine.getHasPin());
        }
        else{
            System.out.println("wrong pin");
            atmMachine.correctPinEntered = false;
            System.out.println("card Ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        }
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("Enter PIN first: ");

    }
}
