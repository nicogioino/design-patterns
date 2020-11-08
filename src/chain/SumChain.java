package chain;

public class SumChain implements Chain {
    Chain nextChain;

    public SumChain() {
    }

    @Override
    public void calculate(CalculationRequest request) {
        if (request.operationsEnum == OperationsEnum.SUM){
            System.out.println(request.number1 + request.number2);
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
