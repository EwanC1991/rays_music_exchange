import instruments.Tuba;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TubaTest {

    Tuba tuba;

    @Before
    public void before() {
        tuba = new Tuba("Yamaha 600-BEAST", "Brass", InstrumentType.BRASS, 400.00, 900.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Yamaha 600-BEAST", tuba.getName());
    }

    @Test
    public void canGetColour() {
        assertEquals("Brass", tuba.getColour());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.BRASS, tuba.getInstrumentType());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(400.00, tuba.getBuyingPrice(), 0.0);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(900.00, tuba.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(500.00, tuba.calculateMarkUp(), 0.0);
    }
}