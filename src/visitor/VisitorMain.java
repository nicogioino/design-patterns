package visitor;

public class VisitorMain {
    public static void main(String[] args) {
        TaxVisitor taxVisitor = new TaxVisitor();
        Necessity necessity = new Necessity(340);
        Tabacco tabacco = new Tabacco(560);
        Liquor liquor = new Liquor(467);

        necessity.accept(taxVisitor);
        tabacco.accept(taxVisitor);
        liquor.accept(taxVisitor);
    }
}
