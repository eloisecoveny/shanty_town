package inhabitants;

import stalls.Horse;

import java.util.ArrayList;

public class Visitor {

    private String name;
    private int age;
    private double height;
    private double purse;
    private boolean haunted;
    private ArrayList<Horse> horses;

    public Visitor(String name, int age, double height, double purse){
        this.name = name;
        this.age = age;
        this.height = height;
        this.purse = purse;
        this.haunted = false;
        this.horses = new ArrayList<Horse>();
    }

    public Object getName(){
        return this.name;
    }

    public int getAge(){
        return age;
    }

    public double getHeight(){
        return height;
    }

    public double getPurse(){
        return purse;
    }

    public boolean isHaunted(){
        return this.haunted;
    }

    public void becomesHaunted(){
        this.haunted = true;
    }

    public void earns(double salary){
        this.purse += salary;
    }

    public void isCharged(double fee){
        this.purse -= fee;
    }

    public void rents(Horse horse){
        this.horses.add(horse);
    }

    public int horseCount(){
        return this.horses.size();
    }
}
