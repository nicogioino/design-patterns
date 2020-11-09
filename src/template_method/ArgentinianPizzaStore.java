package template_method;

public class ArgentinianPizzaStore extends BasePizzaStore{
    @Override
    void takeOrder() {
        System.out.println("Ahi te atiendo pa");
    }

    @Override
    void makePizza() {
        System.out.println("la toy haciendo");
    }

    @Override
    void cookPizza() {
        System.out.println("se eta cocinando, sale musaaa");
    }
}
