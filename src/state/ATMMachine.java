package state;

import state.states.HasCard;
import state.states.HasPin;
import state.states.NoCard;
import state.states.NoCash;

public class ATMMachine {

    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;

    ATMState atmState;

    public int cashInMachine = 2000;
    public boolean correctPinEntered = false;

    public void ATMMAchine(){

        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasPin(this);
        atmOutOfMoney = new NoCash(this);

        atmState = noCard;

        if(cashInMachine < 0){
            atmState = atmOutOfMoney;
        }
    }

    public void setATMState(ATMState newATMState){
        atmState = newATMState;
    }

    public void setCashInMachine(int newCashInMachine){
        cashInMachine = newCashInMachine;
    }

    public void insertCard(){
        atmState.insertCard();
    }

    public void ejectCard(){
        atmState.ejectCard();
    }

    public void requestCash(int amount){
        atmState.requestCash(amount);
    }

    public void insertPin(int pinNumber){
        atmState.insertPin(pinNumber);
    }

    public ATMState getYesCardState(){
        return hasCard;
    }

    public ATMState getNoCardState(){
        return noCard;
    }

    public ATMState getHasPin(){
        return hasCorrectPin;
    }

    public ATMState getNoCashState(){
        return atmOutOfMoney;
    }


}