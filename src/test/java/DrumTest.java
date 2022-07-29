import instruments.Drums;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DrumTest {

    Drums drums;

    @Before
    public void before(){
        drums = new Drums("Tama Pioneer", "Diamond Sparkle", InstrumentType.DRUMS, 1000.00, 1500.00);
    }

    @Test
    public void canGetName(){
            assertEquals("Tama Pioneer", drums.getName());
    }

    @Test
    public  void canGetColour(){
        assertEquals("Diamond Sparkle", drums.getColour());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.DRUMS, drums.getInstrumentType());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(1000.00, drums.getBuyingPrice(), 0.0);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(1500.00, drums.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(500.00, drums.calculateMarkUp(), 0.0);
    }
}