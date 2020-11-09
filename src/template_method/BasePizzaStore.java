package template_method;

public abstract class BasePizzaStore {

    Pizza pizza;

    Pizza createPizzaForDelivery(){
        takeOrder();
        makePizza();
        cookPizza();
        processPayment();
        deliverPizza();
        return pizza;
    }

    abstract void takeOrder();
    abstract void makePizza();
    abstract void cookPizza();

    void processPayment(){
        System.out.println("Payment war approved!");
    }
    void deliverPizza(){
        System.out.println("Pizza has been deliver!");
    }


}
