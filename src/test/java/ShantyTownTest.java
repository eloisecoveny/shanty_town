import attractions.Attraction;
import attractions.Museum;
import inhabitants.Visitor;
import org.junit.Before;
import org.junit.Test;
import stalls.Stables;

import static org.junit.Assert.assertEquals;

public class ShantyTownTest {

    public Visitor visitor;
    public Attraction museum;
    public Stables stables;
    public ShantyTown shantyTown;

    @Before
    public void setup(){
        visitor = new Visitor("Marlene", 32, 165, 32.40);

        museum = new Museum("Local History Museum");

        stables = new Stables("Worrell & Sons", "Peter Worrell", 750);

        shantyTown = new ShantyTown("Calico Town", 52, 1821);
    }

    @Test
    public void hasName(){
        assertEquals("Calico Town", shantyTown.getName());
    }

    @Test
    public void hasPopulation(){
        assertEquals(52, shantyTown.getPopulation());
    }

    @Test
    public void hasEstablishedDate(){
        assertEquals(1821, shantyTown.getEstablished());
    }

    @Test
    public void visitorCanVisitAttraction(){
        String response = "As your close the door behind you the wooden floorboards beneath foot creak and cradle your weight. Dust particles float around you as you breathe in the cloggy scent of old industry and horse-wear. That will cost $10 please, askss the woman behind the counter. Small round spectacles and some unknown scar around the circumference of her neck. Please remember to leave a comment on your way out.";
        assertEquals(response, shantyTown.visit(visitor, museum));
    }

    @Test
    public void visitorCanVisitStall(){
        String response = "It's a mighty fine day today ain't it? Whaddya lookin for? Yer can rent a horse for the day if you wanna get outta here.";
        assertEquals(response, shantyTown.visit(visitor, stables));
    }
}
