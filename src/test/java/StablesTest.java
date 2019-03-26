import inhabitants.Visitor;
import org.junit.Before;
import org.junit.Test;
import stalls.BreedType;
import stalls.Horse;
import stalls.Stables;

import static org.junit.Assert.assertEquals;

public class StablesTest {

    public Stables stables;
    public Horse mustang;
    public Horse paso;
    public Visitor visitor;
    public Visitor kid;

    @Before
    public void setup(){
        stables = new Stables("Worrell & Sons", "Peter Worrell", 750);

        mustang = new Horse("White Spot", BreedType.MUSTANG, 25.00);
        paso = new Horse("Long Hair", BreedType.PASO, 19.00);

        visitor = new Visitor("Marlene", 30, 165, 76.20);
        kid = new Visitor("Bobby", 12, 120, 15.00);
    }

    @Test
    public void canAddHorseToCollection(){
        stables.add(mustang);
        assertEquals(1, stables.horseCount());
    }

    @Test
    public void canRentHorseToVisitor(){
        stables.add(mustang);
        stables.rent(visitor, mustang);
        assertEquals(0, stables.horseCount());
        assertEquals(1, visitor.horseCount());
        assertEquals(51.20, visitor.getPurse(), 0);
    }

    @Test
    public void willNotRentToVisitorsShorterThan130Height(){
        stables.add(mustang);
        stables.rent(kid, mustang);
        assertEquals(1, stables.horseCount());
        assertEquals(0, kid.horseCount());
    }
}
