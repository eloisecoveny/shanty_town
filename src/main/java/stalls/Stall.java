package stalls;

import attractions.IEnter;
import inhabitants.Visitor;

public abstract class Stall implements IEnter {

    private String name;
    private String owner;
    private double realEstateValue;

    public Stall(String name, String owner, double realEstateValue){
        this.name = name;
        this.owner = owner;
        this.realEstateValue = realEstateValue;
    }

    public String getName(){
        return this.name;
    }

    public String getOwner(){
        return this.owner;
    }

    public double getRealEstateValue(){
        return this.realEstateValue;
    }

    public void enter(Visitor visitor, Stall stall){
        stall.enter(visitor);
    }
}
