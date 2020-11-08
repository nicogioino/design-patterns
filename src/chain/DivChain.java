package chain;


public class DivChain implements Chain{
    Chain nextChain;

    public DivChain() {
    }

    @Override
    public void calculate(CalculationRequest request) {
        if (request.operationsEnum == OperationsEnum.DIV){
            System.out.println(request.number1 / request.number2);
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
