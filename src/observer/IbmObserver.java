package observer;

import java.util.List;

public class IbmObserver implements Observer{
    double lastPrice;

    public double getLastPrice() {
        return lastPrice;
    }

    @Override
    public void update(List<Stock> stocks) {
        for (Stock stock: stocks) {
            if (stock.stockName == StockEnum.IBM){
                lastPrice = stock.price;
            }
        }
    }
}
