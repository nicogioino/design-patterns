package chain;

public class CalculationRequest {
    int number1;
    int number2;
    OperationsEnum operationsEnum;

    public CalculationRequest(int number1, int number2, OperationsEnum operationsEnum) {
        this.number1 = number1;
        this.number2 = number2;
        this.operationsEnum = operationsEnum;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public OperationsEnum getOperationsEnum() {
        return operationsEnum;
    }
}
