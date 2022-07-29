package instruments;

import shop.ISell;

public class Keyboard extends Instrument implements IPlay, ISell {

    public Keyboard(String name, String colour, InstrumentType instrumentType, double buyingPrice, double sellingPrice){
        super(name, colour, instrumentType, buyingPrice, sellingPrice);
    }

    public String play(){
        return "* futuristic keyboard sounds *";
    }
}
