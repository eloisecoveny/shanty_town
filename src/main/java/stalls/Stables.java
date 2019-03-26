package stalls;

import inhabitants.Visitor;

import java.util.ArrayList;

public class Stables extends Stall {

    private String name;
    private String owner;
    private double realEstateValue;
    private ArrayList<Horse> horses;

    public Stables(String name, String owner, double realEstateValue){
            super(name, owner, realEstateValue);
            this.horses = new ArrayList<Horse>();
    }

    public void add(Horse horse){
        this.horses.add(horse);
    }

    public int horseCount(){
        return this.horses.size();
    }

    public void rent(Visitor visitor, Horse horse){
        if(visitor.getHeight() >= 130){
            int index = this.horses.indexOf(horse);
            this.horses.remove(index);
            visitor.rents(horse);
            visitor.isCharged(horse.getPrice());
        }
    }


}
