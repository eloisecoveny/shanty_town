package attractions;

import inhabitants.Visitor;

public class CopperMine extends Attraction implements ITicket, IEnter {

    private String name;

    public CopperMine(String name){
        super(name);
    }

    public void work(Visitor visitor, int hours){
        double wages = hours * 5.50;
        visitor.earns(wages);
    }

    public void charge(Visitor visitor){
        visitor.isCharged(8.50);
    }

    public String enter(Visitor visitor){
        this.charge(visitor);
        return "As you descent deeper into the mine all sounds get fainter and fainter, until they disappear entirely. Initially you don't see anything, until your eyes begin to adjust and a sooten man with a yellow beard is standing in front of you with his hand out. That will be $8.50. Welcome to the mine. This is the blood running through our veins and its the air we breathe. This mine will outlive us all. Be careful not to go too deep...";
    }
}
