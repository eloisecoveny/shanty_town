package stalls;

import attractions.IEnter;
import attractions.IWork;
import inhabitants.Visitor;

import java.util.ArrayList;

public class Butchery extends Stall implements IWork, IEnter {

    private ArrayList<BuffaloMeat> stock;

    public Butchery(String name, String owner, double realEstateValue){
        super(name, owner, realEstateValue);
        this.stock = new ArrayList<BuffaloMeat>();
    }

    public void work(Visitor visitor, int hours){
        double salary = hours * 4.15;
        visitor.earns(salary);
    }

    public void sell(Visitor visitor, Item meat){
        double price = ((BuffaloMeat) meat).getPrice();
        visitor.isCharged(price);
    }

    public String enter(Visitor visitor){
        return "Hello " + visitor.getName() + ", whaddya want? I've got buffalo legs, buffalo belly and buffalo head! Freshly hunted and slaughtered my friend.";
    }
}
