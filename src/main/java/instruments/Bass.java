package instruments;

import shop.ISell;

public class Bass extends Instrument implements IPlay, ISell {


    public Bass(String name, String colour, InstrumentType instrumentType, double buyingPrice, double sellingPrice){
        super(name, colour, instrumentType, buyingPrice, sellingPrice);
    }

    public String play(){
        return "* low thudding bass *";
    }
}
