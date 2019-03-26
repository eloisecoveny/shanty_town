import org.junit.Before;
import org.junit.Test;
import stalls.SweetShop;

import static org.junit.Assert.assertEquals;

public class SweetShopTest {

    public SweetShop sweetShop;

    @Before
    public void setup(){
        sweetShop = new SweetShop("Drop Dead", "Billy Baxter", 850);
    }

    @Test
    public void hasName(){
        assertEquals("Drop Dead", sweetShop.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Billy Baxter", sweetShop.getOwner());
    }

    @Test
    public void hasRealEstateValue(){
        assertEquals(850, sweetShop.getRealEstateValue(), 0);
    }
}
