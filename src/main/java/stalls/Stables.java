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

    public String enter(Visitor visitor){
        return "It's a mighty fine day today ain't it? Whaddya lookin for? Yer can rent a horse for the day if you wanna get outta here.";
    }


}
