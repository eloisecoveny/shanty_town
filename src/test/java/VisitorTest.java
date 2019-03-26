import inhabitants.Visitor;
import org.junit.Before;
import org.junit.Test;
import stalls.BreedType;
import stalls.Horse;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    public Visitor visitor;
    public Horse horse;

    @Before
    public void setup(){
        visitor = new Visitor("Marlene", 32, 165, 32.40);
        horse = new Horse("White Spot", BreedType.MUSTANG, 25.00);
    }

    @Test
    public void hasName(){
        assertEquals("Marlene", visitor.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(32, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(165, visitor.getHeight(), 0);
    }

    @Test
    public void hasMoney(){
        assertEquals(32.40, visitor.getPurse(), 0);
    }

    @Test
    public void canRentHorse(){
        visitor.rents(horse);
        assertEquals(1, visitor.horseCount());
    }
}
