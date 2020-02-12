package FinanceAsset;

public class DivStock extends Stock{
    private double dividends;

    public DivStock(String symbol, int shares, double bPrice, double sPrice, double dividends){
        super(symbol, shares, bPrice, sPrice);
        this.dividends = dividends;
    }
    //getters
    public double getDividends(){
        return dividends;
    }
    public double calcDiv(){
        return dividends * getShares();
    }
    public String toString(){
        return ("Symbol: " + super.getSymbol() + ", " +
                "Shares owned: " + getShares() + ", " +
                "Dividends $" + calcProfitLoss());
    }
}
