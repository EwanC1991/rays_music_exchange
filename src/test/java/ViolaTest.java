import instruments.Viola;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ViolaTest {

   Viola viola;

    @Before
    public void before() {
        viola = new Viola("Westbury", "Wood Finish", InstrumentType.STRINGS, 340.00, 500.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Westbury", viola.getName());
    }

    @Test
    public void canGetColour() {
        assertEquals("Wood Finish", viola.getColour());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.STRINGS, viola.getInstrumentType());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(340.00, viola.getBuyingPrice(), 0.0);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(500.00, viola.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(160.00, viola.calculateMarkUp(), 0.0);
    }
}