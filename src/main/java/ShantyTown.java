import attractions.Attraction;
import inhabitants.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ShantyTown {

    private String name;
    private int population;
    private int established;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ShantyTown(String name, int population, int established){
        this.name = name;
        this.population = population;
        this.established = established;
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
    }

    public String getName(){
        return name;
    }

    public int getPopulation(){
        return population;
    }

    public int getEstablished(){
        return established;
    }

    public ArrayList<Attraction> getAttractions(){
        return attractions;
    }

    public ArrayList<Stall> getStalls(){
        return stalls;
    }

    public String visit(Visitor visitor, Attraction attraction){
        return attraction.enter(visitor);
    }

    public String visit(Visitor visitor, Stall stall){
        return stall.enter(visitor);
    }
}
