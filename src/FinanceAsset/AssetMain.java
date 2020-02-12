package FinanceAsset;
import java.util.*;

public class AssetMain {
    public static void main(String[] args){
        //Stock stock1 = new Stock("MSFT", 100, 171, 180);
        //Stock stock2 = new Stock("TSLA", 10, 700, 1000);
        //System.out.println(stock1);
        //System.out.println(stock2);
        //DivStock divStock1 = new DivStock("MSFT", 100, 171, 200, 1);
        //System.out.println(divStock1);

        // we can use arrayList to process objects
        ArrayList<Asset> assetArrayList = new ArrayList<>();
        Stock stock1 = new Stock("MSFT", 100, 171, 180);
        assetArrayList.add(stock1);
        Stock stock2 = new Stock("TSLA", 10, 700, 1000);
        assetArrayList.add(stock2);
        DivStock divStock1 = new DivStock("MSFT", 100, 171, 200, 1);
        assetArrayList.add(divStock1);
        System.out.println(assetArrayList);
        // traditional for loop to print out each element
        for (int i = 0; i < assetArrayList.size(); i++){
            System.out.println(assetArrayList.get(i));
        }
        //shorthand for loop
        for (Asset s: assetArrayList){
            System.out.println(s);
        }
    }
}
