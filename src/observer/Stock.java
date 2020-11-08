package observer;

public class Stock {
    StockEnum stockName;
    double price;

    public Stock(StockEnum stockName, double price) {
        this.stockName = stockName;
        this.price = price;
    }

    public StockEnum getStockName() {
        return stockName;
    }

    public void setStockName(StockEnum stockName) {
        this.stockName = stockName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
