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

    @Test
    public void visitorCanEnterMine(){
        String response = "As you descent deeper into the mine all sounds get fainter and fainter, until they disappear entirely. Initially you don't see anything, until your eyes begin to adjust and a sooten man with a yellow beard is standing in front of you with his hand out. That will be $8.50. Welcome to the mine. This is the blood running through our veins and its the air we breathe. This mine will outlive us all. Be careful not to go too deep...";
        assertEquals(response, copperMine.enter(visitor));
        assertEquals(141.90, visitor.getPurse(), 0);
    }
}
