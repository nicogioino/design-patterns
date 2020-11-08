package chain;

public class MultChain implements Chain {

    Chain nextChain;

    public MultChain() {
    }

    @Override
    public void calculate(CalculationRequest request) {
        if (request.operationsEnum == OperationsEnum.MULT){
            System.out.println(request.number1 * request.number2);
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

