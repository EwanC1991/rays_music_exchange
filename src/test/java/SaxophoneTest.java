import instruments.Saxophone;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone("Yamaha YTS-62", "Brass", InstrumentType.BRASS, 200.00, 320.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Yamaha YTS-62", saxophone.getName());
    }

    @Test
    public void canGetColour() {
        assertEquals("Brass", saxophone.getColour());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.BRASS, saxophone.getInstrumentType());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(200.00, saxophone.getBuyingPrice(), 0.0);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(320.00, saxophone.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(120.00, saxophone.calculateMarkUp(), 0.0);
    }
}