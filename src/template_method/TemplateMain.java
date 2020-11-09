package template_method;

public class TemplateMain {
    public static void main(String[] args) {
    ItalianPizzaStore italianPizzaStore = new ItalianPizzaStore();
    ArgentinianPizzaStore argentinianPizzaStore = new ArgentinianPizzaStore();

    italianPizzaStore.createPizzaForDelivery();
    argentinianPizzaStore.createPizzaForDelivery();
    }


}
