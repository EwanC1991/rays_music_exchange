package instruments;

import shop.ISell;

public class Drums extends Instrument implements IPlay, ISell {

    public Drums(String name, String colour, InstrumentType instrumentType, double buyingPrice, double sellingPrice){
        super(name, colour, instrumentType, buyingPrice, sellingPrice);
    }

    public String play(){
        return "* boom boom pssshhh *";
    }
}
