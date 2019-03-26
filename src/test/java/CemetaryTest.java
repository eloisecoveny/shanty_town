import attractions.Cemetary;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CemetaryTest {

    public Cemetary cemetary;

    @Before
    public void setup(){
        cemetary = new Cemetary("Shire Graveyard");
    }

    @Test
    public void hasName(){
        assertEquals("Shire Graveyard", cemetary.getName());
    }
}
