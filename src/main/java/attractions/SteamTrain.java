package attractions;

import inhabitants.Visitor;

public class SteamTrain extends Attraction implements IWork, ITicket, IEnter {

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

    public String enter(Visitor visitor){
        this.charge(visitor);
        return "All abooooard! Howdy, jump on board. $12 a ticket. Hold on'd'ya hats ladies and gents, toot toooot!";
    }
}
