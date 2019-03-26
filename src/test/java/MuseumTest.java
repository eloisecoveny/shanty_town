import attractions.Museum;
import attractions.Review;
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

    @Test
    public void visitorCanEnter(){
        String response = "As your close the door behind you the wooden floorboards beneath foot creak and cradle your weight. Dust particles float around you as you breathe in the cloggy scent of old industry and horse-wear. That will cost $10 please, askss the woman behind the counter. Small round spectacles and some unknown scar around the circumference of her neck. Please remember to leave a comment on your way out.";
        assertEquals(response, museum.enter(visitor));
        assertEquals(140.40, visitor.getPurse(), 0);
    }

    @Test
    public void visitorCanLeaveReview(){
        visitor.writesReview(museum, "Thank you for introducing me to the history of your town. It's a bit dusty, but that's adds the the ambience!");
        assertEquals(1, museum.countReviews());
    }
}
