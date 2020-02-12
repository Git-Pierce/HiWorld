package FinanceAsset;

public class Stock extends Asset {
    //initializes the class
    public Stock(String symbol, int shares, double bPrice, double sPrice){
        super(symbol, shares, bPrice, sPrice);
    }
    //abstract method that now has logic
    public double calcProfitLoss(){
        return getShares() * (getSellPrice() - getBuyPrice());
    }

    public String toString(){
        return ("Symbol: " + super.getSymbol() + ", " +
                "Shares owned: " + getShares() + ", " +
                "Price bought: $" + getBuyPrice() + ", " +
                "Price sold: $" + getSellPrice() + ", " +
                "P/L: $" + calcProfitLoss());

    }

}
