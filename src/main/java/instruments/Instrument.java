package instruments;

import shop.ISell;

public class Instrument implements ISell {

    private String name;
    private String colour;
    private InstrumentType instrumentType;
    private double buyingPrice;
    private double sellingPrice;


    public Instrument(String name, String colour, InstrumentType instrumentType, double buyingPrice, double sellingPrice){
        this.name = name;
        this.colour = colour;
        this.instrumentType = instrumentType;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkUp(){
        double result = sellingPrice - buyingPrice;
        return result;
    }


    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public double getBuyingPrice(){
        return buyingPrice;
    }

    public double getSellingPrice(){
        return sellingPrice;
    }
}
