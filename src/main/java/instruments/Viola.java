package instruments;

import shop.ISell;

public class Viola extends Instrument implements IPlay, ISell {

    public Viola(String name, String colour, InstrumentType instrumentType, double buyingPrice, double sellingPrice){
        super(name, colour, instrumentType, buyingPrice, sellingPrice);
    }

    public String play(){
        return "* lovely viola sounds *";
    }
}
