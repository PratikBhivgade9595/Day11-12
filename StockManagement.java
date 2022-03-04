package Assg11_12;

import java.util.ArrayList;
import java.util.Scanner;

class Stock {
    String stockName;
    int noOfShares;
    int sharePrice;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNoOfShares() {
        return noOfShares;
    }

    public void setNoOfShares(int noOfShares) {
        this.noOfShares = noOfShares;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }
}

class StockPortfolio {
    Scanner sc = new Scanner(System.in);
    static ArrayList<Stock> portfolio = new ArrayList<>();
    int counter = 0;
    int totalValue;

    public void addStock() {
        Stock stockInfo = new Stock();

        System.out.println("Enter Stock detail you want to purches");
        System.out.println("Enter a Name of Sock: ");
        stockInfo.setStockName(sc.next());
        System.out.println("Enter Number of Shares you want to purches: ");
        stockInfo.setNoOfShares(sc.nextInt());
        System.out.println("Enter Share Price: ");
        stockInfo.setSharePrice(sc.nextInt());

        portfolio.add(stockInfo);
        System.out.println();
        System.out.println("Stock Added");
        counter++;
    }

    public void addNoOfStock() {
        System.out.println("Enter a Number of Stock you want to add");
        int noOfstock = sc.nextInt();
        for (int i = 0; i <= noOfstock; i++) {
            addStock();
        }
    }

    public void totalValue() {
        for (Stock stock : portfolio) {
            totalValue += stock.sharePrice * stock.noOfShares;
        }
        System.out.println(totalValue);
    }
}

public class StockManagement {
    StockPortfolio a = new StockPortfolio();

    public void main(String[] args) {

        int choice = 0;
        while (choice < 4) ;
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice \n1: Add Stock \n2: Add Multiple of Stocks "
                    + "\n3: Display Total value of Stocks \n0: Exit ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    a.addStock();
                    break;
                case 2:
                    a.addNoOfStock();
                    break;
                case 3:
                    System.out.println("Total value of your stocks is : ");
                    a.totalValue();
                    break;
                default:
                    System.out.println("Exit");
                    choice = 3;
            }
        }
    }
}


