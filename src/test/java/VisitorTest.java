import inhabitants.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    public Visitor visitor;

    @Before
    public void setup(){
        visitor = new Visitor("Marlene", 32, 165, 32.40);
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
}
