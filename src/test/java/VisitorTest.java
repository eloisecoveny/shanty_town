import attractions.Museum;
import attractions.Review;
import inhabitants.Visitor;
import org.junit.Before;
import org.junit.Test;
import stalls.BreedType;
import stalls.Horse;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    public Visitor visitor;
    public Horse horse;
    public Museum museum;

    @Before
    public void setup(){
        visitor = new Visitor("Marlene", 32, 165, 32.40);
        horse = new Horse("White Spot", BreedType.MUSTANG, 25.00);
        museum = new Museum("Local History Museum");
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

    @Test
    public void canWriteReview(){
        String body = "Thank you for introducing me to the history of your town. It's a bit dusty, but that's adds the the ambience!";
        visitor.writesReview(museum, body);
        assertEquals(1, museum.countReviews());
    }
}
