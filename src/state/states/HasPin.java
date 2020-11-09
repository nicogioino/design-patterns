package state.states;

import state.ATMMachine;
import state.ATMState;

public class HasPin implements ATMState {

    ATMMachine atmMachine;

    public HasPin(ATMMachine newATMMachine){
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
        System.out.println("Already entered PIN");

    }

    @Override
    public void requestCash(int amount) {
        if(amount > atmMachine.cashInMachine){
            System.out.println("Don't have that cash");
            System.out.println("Card Ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        }
        else {
            System.out.println(amount + " privided by machine");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - amount);
            System.out.println("Card Ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());

            if (atmMachine.cashInMachine <= 0){
                atmMachine.setATMState(atmMachine.getNoCardState());
            }
        }
    }
}
