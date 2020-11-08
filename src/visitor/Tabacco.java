package visitor;

public class Tabacco implements Visitable {
    double price;

    public Tabacco(double price) {
        this.price = price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
