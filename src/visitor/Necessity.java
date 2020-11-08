package visitor;

public class Necessity implements Visitable {
    double price;

    public Necessity(double price) {
        this.price = price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
