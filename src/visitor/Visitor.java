package visitor;

public interface Visitor {
    double visit(Liquor liquor);
    double visit(Necessity necessity);
    double visit(Tabacco tabacco);
}
