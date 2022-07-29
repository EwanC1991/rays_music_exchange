import org.junit.Before;
import org.junit.Test;
import shop.GuitarStrings;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings("Elixr", 6.00, 15.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Elixr", guitarStrings.getName());
    }

    @Test
    public void  canGetBuyingPrice(){
        assertEquals(6.00, guitarStrings.getBuyingPrice(), 0.0);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(15.00, guitarStrings.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(9.00, guitarStrings.calculateMarkUp(), 0.0);
    }
}