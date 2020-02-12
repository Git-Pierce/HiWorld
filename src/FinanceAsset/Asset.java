package FinanceAsset;
// this package has been committed to GitHub
// this is just a test change to the file
//
// this change was made on Feb 12, 2020
public abstract class Asset {
    // private variables
    private String symbol;
    private int shares;
    private double buyPrice;
    private double sellPrice;
    //constructor
    public Asset(String symbol, int shares, double buyPrice, double sellPrice){
        this.symbol = symbol;
        this.shares = shares;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }
    //getters
    public String getSymbol(){
        return symbol;
    }
    public int getShares(){
        return shares;
    }
    public double getBuyPrice(){
        return buyPrice;
    }
    public double getSellPrice(){
        return sellPrice;
    }
    //polymorphism behavior
    public abstract double calcProfitLoss();

    public String toString(){
        return ("Symbol: " + symbol + "Bought at: " + buyPrice
        + "Sold at: $" + sellPrice + "P/L: $" + calcProfitLoss());
    }
}
