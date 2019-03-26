import attractions.CopperMine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CopperMineTest {

    public CopperMine copperMine;

    @Before
    public void setup(){
        copperMine = new CopperMine("Lady Valley");
    }

    @Test
    public void hasName(){
        assertEquals("Lady Valley", copperMine.getName());
    }
}
