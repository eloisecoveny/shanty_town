package stalls;

import attractions.IWork;
import inhabitants.Visitor;

public class Butchery extends Stall implements IWork {

    private String name;
    private String owner;
    private double realEstateValue;

    public Butchery(String name, String owner, double realEstateValue){
        super(name, owner, realEstateValue);
    }

    public void work(Visitor visitor, int hours){
        double salary = hours * 4.15;
        visitor.earns(salary);
    }

    public void sell(Visitor visitor, Item meat){
        double price = ((BuffaloMeat) meat).getPrice();
        visitor.isCharged(price);
    }
}
