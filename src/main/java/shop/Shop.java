package shop;

import instruments.Instrument;

import java.util.ArrayList;

public class Shop {

    public ArrayList<ISell>stock;
    private double till;

    public Shop(ArrayList<ISell>stock, double till){
        this.stock = stock;
        this.till = till;
    }

    public double getTill(){
        return this.till;
    }

    public void addToStock(ISell item){
        if (item instanceof Instrument){
           double retailerPrice = ((Instrument) item).getBuyingPrice();
           this.till = this.till - retailerPrice;
           stock.add(item);
        }
        if (item instanceof ShopItem){
            double retailerPrice = ((ShopItem) item).getBuyingPrice();
            this.till = this.till - retailerPrice;
            stock.add(item);
        }
    }

    public void sellItem(ISell item){
        if (item instanceof Instrument){
            double consumerPrice = ((Instrument) item).getSellingPrice();
            this.till = this.till + consumerPrice;
            stock.remove(item);
        }
        if (item instanceof ShopItem){
            double consumerPrice = ((ShopItem) item).getSellingPrice();
            this.till = this.till + consumerPrice;
            stock.remove(item);
        }
    }

    public double calculateTotalMarkUpForAllStock(ArrayList<ISell>stock){
        double total = 0;
        for (ISell item: stock){
            double newTotal = total + item.calculateMarkUp();
            total = newTotal;
        }
        return total;
    }

    public int getStockCount(){
        return stock.size();
    }
}
