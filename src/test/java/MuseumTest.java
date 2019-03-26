import attractions.Museum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MuseumTest {

    public Museum museum;

    @Before
    public void setup(){
        museum = new Museum("Local History Museum");
    }

    @Test
    public void hasName(){
        assertEquals("Local History Museum", museum.getName());
    }
}
