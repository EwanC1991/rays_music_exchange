package shop;

public class DrumSticks extends ShopItem {

    private String name;
    private double buyingPrice;
    private double sellingPrice;

    public DrumSticks(String name, double buyingPrice, double sellingPrice){
        super(name, buyingPrice, sellingPrice);
    }
}
