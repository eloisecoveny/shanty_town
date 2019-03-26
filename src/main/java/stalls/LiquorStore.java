package stalls;

import inhabitants.Visitor;

public class LiquorStore extends Stall implements ISecurity, ISell {

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

    public void sell(Visitor visitor, Item bottleOfLiquor){
        double price = ((BottleOfLiquor) bottleOfLiquor).getPrice();
        visitor.isCharged(price);
    }

}
