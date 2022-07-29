import instruments.Keyboard;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import java.security.Key;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before() {
        keyboard = new Keyboard("Casio 120-PX", "Grey", InstrumentType.KEYBOARD, 300.00, 350.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Casio 120-PX", keyboard.getName());
    }

    @Test
    public void canGetColour() {
        assertEquals("Grey", keyboard.getColour());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.KEYBOARD, keyboard.getInstrumentType());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(300.00, keyboard.getBuyingPrice(), 0.0);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(350.00, keyboard.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(50.00, keyboard.calculateMarkUp(), 0.0);
    }
}