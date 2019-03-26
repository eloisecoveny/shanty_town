import inhabitants.Visitor;
import org.junit.Before;
import org.junit.Test;
import stalls.BottleOfLiquor;
import stalls.BottleType;
import stalls.Item;
import stalls.LiquorStore;

import static org.junit.Assert.assertEquals;

public class LiquorStoreTest {

    public LiquorStore liquorStore;
    public Visitor visitor;
    public Item bottleOfLiquer;

    @Before
    public void setup() {
        liquorStore = new LiquorStore("Whisky Salon", "Richard Mitchell", 650);
        visitor = new Visitor("Marlene", 32, 165, 32.40);
        bottleOfLiquer = new BottleOfLiquor(BottleType.RUM);
    }

    @Test
    public void hasName(){
        assertEquals("Whisky Salon", liquorStore.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Richard Mitchell", liquorStore.getOwner());
    }

    @Test
    public void hasRealEstateValue(){
        assertEquals(650, liquorStore.getRealEstateValue(), 0);
    }

    @Test
    public void canSellBottleToVisitor(){
        liquorStore.sell(visitor, bottleOfLiquer);
        assertEquals(26.50, visitor.getPurse(), 0);
    }
}