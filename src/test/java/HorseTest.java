import org.junit.Before;
import org.junit.Test;
import stalls.BreedType;
import stalls.Horse;

import static org.junit.Assert.assertEquals;

public class HorseTest {

    public Horse horse;

    @Before
    public void setup(){
        horse = new Horse("White Spot", BreedType.MUSTANG, 25.00);
    }

    @Test
    public void hasName(){
        assertEquals("White Spot", horse.getName());
    }

    @Test
    public void hasBreed(){
        assertEquals(BreedType.MUSTANG, horse.getBreed());
    }

    @Test
    public void hasPrice(){
        assertEquals(25.00, horse.getPrice(), 0);
    }
}
