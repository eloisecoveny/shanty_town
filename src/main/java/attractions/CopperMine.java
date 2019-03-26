package attractions;

import inhabitants.Visitor;

public class CopperMine extends Attraction implements ITicket {

    private String name;

    public CopperMine(String name){
        super(name);
    }

    public void work(Visitor visitor, int hours){
        double salary = hours * 5.50;
        visitor.earns(salary);
    }

    public void charge(Visitor visitor){
        visitor.isCharged(8.50);
    }
}
