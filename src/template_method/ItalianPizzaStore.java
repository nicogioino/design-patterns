package template_method;

public class ItalianPizzaStore extends BasePizzaStore{

    @Override
    void takeOrder() {
        System.out.println("taking ItalianPizza Order");
    }

    @Override
    void makePizza() {
        System.out.println("Making ItalianPizza");
    }

    @Override
    void cookPizza() {
        System.out.println("Cooking ItalianPizza");
    }
}
