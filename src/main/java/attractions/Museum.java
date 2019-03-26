package attractions;

import inhabitants.Visitor;

public class Museum extends Attraction implements ITicket {

    private String name;

    public Museum(String name){
        super(name);
    }

    public void charge(Visitor visitor){
        visitor.isCharged(10.00);
    }
}
