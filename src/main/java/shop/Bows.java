package shop;

public class Bows extends ShopItem {

    private String name;
    private double buyingPrice;
    private double sellingPrice;

    public Bows(String name, double buyingPrice, double sellingPrice){
        super(name, buyingPrice, sellingPrice);
    }
}
