package chain;

public class SqrtChain implements Chain {
    Chain nextChain;

    public SqrtChain() {
    }

    @Override
    public void calculate(CalculationRequest request) {
        if (request.operationsEnum == OperationsEnum.SQRT) {
            System.out.println(Math.sqrt(request.number1));
        }
        else {
            nextChain.calculate(request);
        }
    }

    @Override
    public void setNextChain(Chain chain) {
        nextChain = chain;

    }
}
