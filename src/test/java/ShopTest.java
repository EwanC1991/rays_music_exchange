import instruments.*;
import org.junit.Before;
import org.junit.Test;
import shop.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Bass bass;
    Bows bow;
    DrumSticks drumSticks;
    Drums drums;
    GuitarStrings guitarStrings;
    Guitar guitar;
    Keyboard keyboard;
    Plectrums plectrum;
    Saxophone saxophone;
    Tuba tuba;
    Viola viola;
    Violin violin;
    ArrayList<ISell>stock;



    @Before
    public void before(){
            stock = new ArrayList<>();
            bass = new Bass("Fender Jazz", "Red", InstrumentType.BASS, 400.00, 650.00);
            bow = new Bows("Tenor", 50.00, 60.00);
            drumSticks = new DrumSticks("Sabian", 10.00, 20.00);
            drums = new Drums("Tama Pioneer", "Diamond Sparkle", InstrumentType.DRUMS, 1000.00, 1500.00);
            guitarStrings = new GuitarStrings("Elixr", 6.00, 15.00);
            guitar = new Guitar("Fender Telecaster", "Black", InstrumentType.GUITAR, 650.00, 900.00);
            keyboard = new Keyboard("Casio 120-PX", "Grey", InstrumentType.KEYBOARD, 300.00, 350.00);
            plectrum = new Plectrums("Ernie Ball", 1.20, 2.00);
            saxophone = new Saxophone("Yamaha YTS-62", "Brass", InstrumentType.BRASS, 200.00, 320.00);
            tuba = new Tuba("Yamaha 600-BEAST", "Brass", InstrumentType.BRASS, 400.00, 900.00);
            viola = new Viola("Westbury", "Wood Finish", InstrumentType.STRINGS, 340.00, 500.00);
            violin = new Violin("Archer", "Maple", InstrumentType.STRINGS, 135.00, 400.00);
            stock.add(bass);
            stock.add(bow);
            stock.add(drumSticks);
            stock.add(drums);
            stock.add(guitarStrings);
            stock.add(guitar);
            stock.add(keyboard);
            stock.add(plectrum);
            stock.add(saxophone);
            stock.add(tuba);
            stock.add(viola);
            shop = new Shop(stock, 1000.00);
    }

    @Test
    public void canGetStockCount(){
        assertEquals(11, shop.getStockCount());
    }

    @Test
    public void canGetTill(){
        assertEquals(1000.00, shop.getTill(), 0.0);
    }

    @Test
    public void sellingItemIncreasesTillAndRemovesItemFromStock(){
        shop.sellItem(guitar);
        assertEquals(1900.00, shop.getTill(), 0.0);
        assertEquals(10, shop.getStockCount());
    }

    @Test
    public void buyingItemDecreasesTillAndAddItemToStock(){
        shop.addToStock(violin);
        assertEquals(865.00, shop.getTill(), 0.0);
        assertEquals(12, shop.getStockCount());
    }

    @Test
    public void canCalculateCorrectTotalMarkUp(){
        assertEquals(1859.80, shop.calculateTotalMarkUpForAllStock(stock), 0.0);
    }


}
