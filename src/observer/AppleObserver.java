package observer;

import java.util.List;

public class AppleObserver implements Observer {
    double lastPrice =0;

    @Override
    public void update(List<Stock> stocks) {
        for (Stock stock: stocks) {
            if (stock.stockName == StockEnum.APPLE){
                lastPrice = stock.price;
            }
        }
    }

    public double getLastPrice() {
        return lastPrice;
    }
}
