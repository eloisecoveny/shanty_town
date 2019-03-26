package attractions;

import inhabitants.Visitor;

public class Cemetary extends Attraction implements IHaunt {

    private String name;

    public Cemetary(String name){
        super(name);
    }

    public void haunt(Visitor visitor){
        visitor.becomesHaunted();
    }
}
