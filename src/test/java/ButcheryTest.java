import org.junit.Before;
import org.junit.Test;
import stalls.Butchery;

import static org.junit.Assert.assertEquals;

public class ButcheryTest {

    public Butchery butchery;

    @Before
    public void setup(){
        butchery = new Butchery("Nice to Meat You", "Thomas Thackery", 500);
    }

    @Test
    public void hasName(){
        assertEquals("Nice to Meat You", butchery.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Thomas Thackery", butchery.getOwner());
    }

    @Test
    public void hasRealEstateValue(){
        assertEquals(500, butchery.getRealEstateValue(), 0);
    }
}
