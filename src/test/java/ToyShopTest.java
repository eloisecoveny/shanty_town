import org.junit.Before;
import stalls.ToyShop;

public class ToyShopTest {

    public ToyShop toyShop;

    @Before
    public void setup(){
        toyShop = new ToyShop("Worrell & Sons", "Peter Worrell", 750);
    }
}
