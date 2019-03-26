import attractions.SteamTrain;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SteamTrainTest {

    public SteamTrain steamTrain;

    @Before
    public void setup(){
        steamTrain = new SteamTrain("Chicago");
    }

    @Test
    public void hasName(){
        assertEquals("Chicago", steamTrain.getName());
    }
}
