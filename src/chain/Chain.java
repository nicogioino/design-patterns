package chain;

public interface Chain {
    void calculate(CalculationRequest request);
    void setNextChain(Chain chain);
}
