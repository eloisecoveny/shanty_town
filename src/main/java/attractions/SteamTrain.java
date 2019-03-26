package attractions;

import inhabitants.Visitor;

public class SteamTrain extends Attraction implements IWork, ITicket {

    private String name;

    public SteamTrain(String name){
        super(name);
    }

    public void work(Visitor visitor, int hours){
        double salary = hours * 8.20;
        visitor.earns(salary);
    }

    public void charge(Visitor visitor){
        visitor.isCharged(12.00);
    }
}
