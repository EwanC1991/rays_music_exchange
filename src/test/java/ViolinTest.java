import instruments.Violin;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ViolinTest {

    Violin violin;

    @Before
    public void before() {
        violin = new Violin("Archer", "Maple", InstrumentType.STRINGS, 135.00, 400.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Archer", violin.getName());
    }

    @Test
    public void canGetColour() {
        assertEquals("Maple", violin.getColour());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.STRINGS, violin.getInstrumentType());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(135.00, violin.getBuyingPrice(), 0.0);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(400.00, violin.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(265.00, violin.calculateMarkUp(), 0.0);
    }
}