package state.states;

import state.ATMMachine;
import state.ATMState;

public class NoCash implements ATMState {

    ATMMachine atmMachine;

    public NoCash(ATMMachine newATMMachine){
        atmMachine = newATMMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("We don't have money");
    }

    @Override
    public void ejectCard() {
        System.out.println("We don't have money. You didn't entered a card");
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("We don't have money");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("We don't have money");
    }
}
