import attractions.CopperMine;
import inhabitants.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CopperMineTest {

    public CopperMine copperMine;
    public Visitor visitor;

    @Before
    public void setup(){
        copperMine = new CopperMine("Lady Valley");
        visitor = new Visitor("Eloise", 32, 165, 150.40);
    }

    @Test
    public void hasName(){
        assertEquals("Lady Valley", copperMine.getName());
    }

    @Test
    public void visitorCanWorkAndEarnMoney(){
        copperMine.work(visitor, 10);
        assertEquals(205.40, visitor.getPurse(), 0);
    }

    @Test
    public void visitorCanBeTicketed(){
        copperMine.charge(visitor);
        assertEquals(141.90, visitor.getPurse(), 0);
    }
}
