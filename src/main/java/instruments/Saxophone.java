package instruments;

import shop.ISell;

public class Saxophone extends Instrument implements IPlay, ISell {


    public Saxophone(String name, String colour, InstrumentType instrumentType, double buyingPrice, double sellingPrice){
        super(name, colour, instrumentType, buyingPrice, sellingPrice);
    }

    public String play(){
        return "* sexy sax vibes *";
    }
}
