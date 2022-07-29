import org.junit.Before;
import org.junit.Test;
import shop.DrumSticks;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("Sabian", 10.00, 20.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Sabian", drumSticks.getName());
    }

    @Test
    public void  canGetBuyingPrice(){
        assertEquals(10.00, drumSticks.getBuyingPrice(), 0.0);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(20.00, drumSticks.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(10.00, drumSticks.calculateMarkUp(), 0.0);
    }
}