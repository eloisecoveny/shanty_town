package stalls;

import attractions.IEnter;
import inhabitants.Visitor;

import java.util.ArrayList;

public class LiquorStore extends Stall implements ISecurity, IEnter {

    private ArrayList<BottleOfLiquor> stock;

    public LiquorStore(String name, String owner, double realEstateValue){
        super(name, owner, realEstateValue);
        this.stock = new ArrayList<BottleOfLiquor>();
    }

    public boolean isOldEnough(Visitor visitor){
        if(visitor.getAge() >= 18){
            return true;
        } else {
            return false;
        }
    }

    public String sells(Visitor visitor, Item bottleOfLiquor){
        double price = ((BottleOfLiquor) bottleOfLiquor).getPrice();
        if(this.isOldEnough(visitor)){
            visitor.isCharged(price);
            return "Careful not to drink it all at once kid.";
        } else {
            return "Get outta here or I'll get my gun!";
        }
    }

    public String enter(Visitor visitor){
        return "Welcome to the " + this.getName() + ". What can I get ya? First round is on me.";
    }

}
