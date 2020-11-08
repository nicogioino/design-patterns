package visitor;

public class Liquor implements Visitable {
    double price;

    public Liquor(double price) {
        this.price = price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
