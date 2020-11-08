package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observers;
    double ibmPrice;
    double googlePrice;
    double applePrice;

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObservers();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notifyObservers();
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        notifyObservers();
    }

    public Subject() {
        observers = new ArrayList<>();
        ibmPrice = 0D;
        googlePrice = 0D;
        applePrice = 0D;
    }

    void registerObserver(Observer observer){
        observers.add(observer);
    }

    void unregisterObserver(Observer observer){
        observers.remove(observer);
    }

    void notifyObservers(){
        List <Stock> stocks = new ArrayList<>();
        stocks.add(new Stock(StockEnum.APPLE,applePrice));
        stocks.add(new Stock(StockEnum.IBM,ibmPrice));
        stocks.add(new Stock(StockEnum.GOOGLE,googlePrice));
        for (Observer observer: observers) {
            observer.update(stocks);
        }
    }

}
