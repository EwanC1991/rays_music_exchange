package instruments;

import shop.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    public Guitar(String name, String colour, InstrumentType instrumentType, double buyingPrice, double sellingPrice){
        super(name, colour, instrumentType, buyingPrice, sellingPrice);
    }

    public String play(){
        return "* epic guitar sounds *";
    }
}
