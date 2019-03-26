import attractions.Cemetary;
import inhabitants.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CemetaryTest {

    public Cemetary cemetary;
    public Visitor visitor;

    @Before
    public void setup(){
        cemetary = new Cemetary("Shire Graveyard");
        visitor = new Visitor("Marlene", 32, 165, 32.40);
    }

    @Test
    public void hasName(){
        assertEquals("Shire Graveyard", cemetary.getName());
    }

    @Test
    public void canHauntVisitor(){
        cemetary.haunt(visitor);
        assertEquals(true, visitor.isHaunted());
    }

    @Test
    public void visitorCanEnterCemetary(){
        String response = "You hear the faint howling of the wind, and distant crackling in the surrounding woods. Welcome to the cemetary.";
        assertEquals(response, cemetary.enter(visitor));
    }
}
