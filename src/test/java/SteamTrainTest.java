import attractions.SteamTrain;
import inhabitants.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SteamTrainTest {

    public SteamTrain steamTrain;
    public Visitor visitor;

    @Before
    public void setup(){
        steamTrain = new SteamTrain("Chicago");
        visitor = new Visitor("Eloise", 32, 165, 150.40);
    }

    @Test
    public void hasName(){
        assertEquals("Chicago", steamTrain.getName());
    }

    @Test
    public void visitorCanWorkAndEarnMoney(){
        steamTrain.work(visitor, 10);
        assertEquals(232.40, visitor.getPurse(), 0);
    }

    @Test
    public void canChargeVisitor(){
        steamTrain.charge(visitor);
        assertEquals(138.40, visitor.getPurse(), 0);
    }

    @Test
    public void visitorCanEnter(){
        String response = "All abooooard! Howdy, jump on board. $12 a ticket. Hold on'd'ya hats ladies and gents, toot toooot!";
        assertEquals(response, steamTrain.enter(visitor));
        assertEquals(138.40, visitor.getPurse(), 0);
    }
}
