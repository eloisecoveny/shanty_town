import inhabitants.Visitor;
import org.junit.Before;
import org.junit.Test;
import stalls.BuffaloBodyPart;
import stalls.BuffaloMeat;
import stalls.Butchery;

import static org.junit.Assert.assertEquals;

public class ButcheryTest {

    public Butchery butchery;
    public Visitor visitor;
    public BuffaloMeat meat;

    @Before
    public void setup(){
        butchery = new Butchery("Nice to Meat You", "Thomas Thackery", 500);
        visitor = new Visitor("Marlene", 32, 165, 32.40);
        meat = new BuffaloMeat(BuffaloBodyPart.HEAD);
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

    @Test
    public void visitorCanWorkAndEarnMoney(){
        butchery.work(visitor, 8);
        assertEquals(65.60, visitor.getPurse(), 0);
    }

    @Test
    public void canSellBuffaloMeat(){
        butchery.sell(visitor, meat);
        assertEquals(30.20, visitor.getPurse(), 0);
    }
}
