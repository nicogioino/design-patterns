package chain;

public class ChainMain {
    public static void main(String[] args) {
        DivChain start = new DivChain();
        SumChain sumChain = new SumChain();
        MultChain multChain = new MultChain();
        SubChain subChain = new SubChain();
        SqrtChain sqrtChain = new SqrtChain();

        start.setNextChain(multChain);
        multChain.setNextChain(subChain);
        subChain.setNextChain(sumChain);
        sumChain.setNextChain(sqrtChain);


        CalculationRequest calculationRequest = new CalculationRequest(1,2,OperationsEnum.SQRT);

        start.calculate(calculationRequest);

    }
}
