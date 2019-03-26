import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShantyTownTest {

    public ShantyTown shantyTown;

    @Before
    public void setup(){
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
}
