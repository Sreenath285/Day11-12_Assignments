import java.util.ArrayList;

public class Stock {

    ArrayList<Stock> stockArrayList = new ArrayList<>();

    private String shareName;
    private int noOfShares;
    private double pricePerShare, totalSharePrice, totalValue;

    public ArrayList<Stock> getStockArrayList() {
        return stockArrayList;
    }

    public void setStockArrayList(ArrayList<Stock> stockArrayList) {
        this.stockArrayList = stockArrayList;
    }

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public int getNoOfShares() {
        return noOfShares;
    }

    public void setNoOfShares(int noOfShares) {
        this.noOfShares = noOfShares;
    }

    public double getPricePerShare() {
        return pricePerShare;
    }

    public void setPricePerShare(double pricePerShare) {
        this.pricePerShare = pricePerShare;
    }

    public double getTotalSharePrice() {
        return totalSharePrice;
    }

    public void setTotalSharePrice(double totalSharePrice) {
        this.totalSharePrice = totalSharePrice;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    @Override
    public String toString() {
        System.out.println("---------------------------------------------------");
        System.out.println(" Share name : " + shareName);
        System.out.println(" Total number of shares purchased : " + noOfShares);
        System.out.println(" Price per share : " + pricePerShare);
        System.out.println(" Total share value : " + totalSharePrice);
        return "";
    }
}
