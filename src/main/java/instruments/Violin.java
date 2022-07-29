package instruments;

import shop.ISell;

public class Violin extends Instrument implements IPlay, ISell {

    public Violin(String name, String colour, InstrumentType instrumentType, double buyingPrice, double sellingPrice){
        super(name, colour, instrumentType, buyingPrice, sellingPrice);
    }

    public String play(){
        return "* sad violin music *";
    }
}
