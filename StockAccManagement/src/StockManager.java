import java.util.ArrayList;
import java.util.Scanner;

public class StockManager {

    ArrayList<Stock> stockArrayList = new ArrayList<>();
    Account account = new Account(10000);
    Scanner sc = new Scanner(System.in);

    public Stock findShare (String shareNm) {
        for (Stock stockTemp : stockArrayList) {
            if (stockTemp.getShareName().equals(shareNm)) {
                return stockTemp;
            }
        }
        return null;
    }

    public Stock buyShare (String shareNm) {
        System.out.print("Enter price per share : ");
        double _pricePerShare = sc.nextDouble();

        Stock stockBuy = new Stock();
        stockBuy.setShareName(shareNm);
        stockBuy.setNoOfShares(0);
        stockBuy.setPricePerShare(_pricePerShare);
        stockArrayList.add(stockBuy);

        return stockBuy;
    }

    public void buy (int amount, String symbol) {
        if (amount > account.getAmount()) {
            System.out.println("Insufficient amount");
            return;
        }
        Stock stockFind = findShare(symbol);
        if (stockFind == null) {
            stockFind = buyShare(symbol);
        }

        int _noOfShares = (int)(amount / stockFind.getPricePerShare());
        double _debitAmount =_noOfShares * stockFind.getPricePerShare();
        account.debit(_debitAmount);
        stockFind.setNoOfShares(_noOfShares + stockFind.getNoOfShares());
        stockFind.setTotalSharePrice(stockFind.getNoOfShares() * stockFind.getPricePerShare());
    }

    public void sell(int amount, String symbol) {
        Stock stockFind = findShare(symbol);
        if (stockFind == null) {
            System.out.println("Not able to proceed");
            return;
        }
        int _noOfShares = (int) (amount / stockFind.getPricePerShare());
        if (_noOfShares > stockFind.getNoOfShares()) {
            _noOfShares = stockFind.getNoOfShares();
        }
        stockFind.setNoOfShares(stockFind.getNoOfShares() - _noOfShares);
        double _stockPrice = stockFind.getNoOfShares() * stockFind.getPricePerShare();
        stockFind.setTotalSharePrice(_stockPrice);
        double _creditAmount = stockFind.getPricePerShare() * _noOfShares;
        account.credit(_creditAmount);

    }

    public void showStocks() {
        double totVal = 0;
        for (Stock stockShowTemp : stockArrayList) {
            System.out.println(stockShowTemp);
            totVal += stockShowTemp.getTotalSharePrice();
        }
//        System.out.println("Balance amount : " + totVal);
    }

    public double currentBal () {
        System.out.println("Current balance : " + account.getAmount());
        return account.getAmount();
    }
}
