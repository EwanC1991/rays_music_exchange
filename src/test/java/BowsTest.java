import org.junit.Before;
import org.junit.Test;
import shop.Bows;

import static org.junit.Assert.assertEquals;

public class BowsTest {

    Bows bow;

    @Before
    public void before(){
        bow = new Bows("Tenor", 50.00, 60.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Tenor", bow.getName());
    }

    @Test
    public void  canGetBuyingPrice(){
        assertEquals(50.00, bow.getBuyingPrice(), 0.0);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(60.00, bow.getSellingPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(10.00, bow.calculateMarkUp(), 0.0);
    }
}
