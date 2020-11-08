package visitor;

public class TaxVisitor implements Visitor{
    /*
    Si quiero cambiar como se calcula el tax d eun item solo cambio el visitor, no tendria que cambiar la clase en si -> no romnpo nada en otro lado
     */

    @Override
    public double visit(Liquor liquor) {
        System.out.println("Esta visitando a liquor");
        return liquor.price*1.2;
    }

    @Override
    public double visit(Necessity necessity) {
        System.out.println("Esta visitando a necessity");
        return necessity.price*1.1;
    }

    @Override
    public double visit(Tabacco tabacco) {
        System.out.println("Esta visitando a tabacco");
        return tabacco.price*1.4;
    }
}
