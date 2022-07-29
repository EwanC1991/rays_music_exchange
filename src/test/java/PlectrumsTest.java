import org.junit.Before;
import org.junit.Test;
import shop.Plectrums;

import static org.junit.Assert.assertEquals;

public class PlectrumsTest {

    Plectrums plectrum;

    @Before
    public void before(){
        plectrum = new Plectrums("Ernie Ball", 1.20, 2.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Ernie Ball", plectrum.getName());
    }

    @Test
    public void  canGetBuyingPrice(){
        assertEquals(1.20, plectrum.getBuyingPrice(), 0.0);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(2.00, plectrum.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(0.80, plectrum.calculateMarkUp(), 0.0);
    }
}