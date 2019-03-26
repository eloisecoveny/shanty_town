import attractions.Museum;
import inhabitants.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MuseumTest {

    public Museum museum;
    public Visitor visitor;

    @Before
    public void setup(){
        museum = new Museum("Local History Museum");
        visitor = new Visitor("Eloise", 32, 165, 150.40);
    }

    @Test
    public void hasName(){
        assertEquals("Local History Museum", museum.getName());
    }

    @Test
    public void canChargeVisitor(){
        museum.charge(visitor);
        assertEquals(140.40, visitor.getPurse(), 0);
    }
}
