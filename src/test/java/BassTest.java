import instruments.Bass;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BassTest {

    Bass bass;

    @Before
    public void before(){
        bass = new Bass("Fender Jazz", "Red", InstrumentType.BASS, 400.00, 650.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Fender Jazz", bass.getName());
    }

    @Test
    public  void canGetColour(){
        assertEquals("Red", bass.getColour());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.BASS, bass.getInstrumentType());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(400.00, bass.getBuyingPrice(), 0.0);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(650.00, bass.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(250.00, bass.calculateMarkUp(), 0.0);
    }
}
