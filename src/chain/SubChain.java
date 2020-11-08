package chain;

public class SubChain implements Chain {
    Chain nextChain;

    public SubChain() {
    }

    @Override
    public void calculate(CalculationRequest request) {
        if (request.operationsEnum == OperationsEnum.SUB){
            System.out.println(request.number1 - request.number2);
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
