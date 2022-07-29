import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Fender Telecaster", "Black", InstrumentType.GUITAR, 650.00, 900.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Fender Telecaster", guitar.getName());
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", guitar.getColour());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.GUITAR, guitar.getInstrumentType());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(650.00, guitar.getBuyingPrice(), 0.0);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(900.00, guitar.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(250.00, guitar.calculateMarkUp(), 0.0);
    }
}