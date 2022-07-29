package instruments;

import shop.ISell;

public class Tuba extends Instrument implements IPlay, ISell {

    public Tuba(String name, String colour, InstrumentType instrumentType, double buyingPrice, double sellingPrice){
        super(name, colour, instrumentType, buyingPrice, sellingPrice);
    }

    public String play(){
        return "* low parps *";
    }
}
