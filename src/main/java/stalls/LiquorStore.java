package stalls;

import attractions.IEnter;
import inhabitants.Visitor;

public class LiquorStore extends Stall implements ISecurity, IEnter {

    public LiquorStore(String name, String owner, double realEstateValue){
        super(name, owner, realEstateValue);
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
        return "You hear the " + this.getName() + ". What can I get ya? First round is on me.";
    }

}
