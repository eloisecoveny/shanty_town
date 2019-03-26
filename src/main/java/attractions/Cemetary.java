package attractions;

import inhabitants.Visitor;

public class Cemetary extends Attraction implements IHaunt, IEnter {

    private String name;

    public Cemetary(String name){
        super(name);
    }

    public void haunt(Visitor visitor){
        visitor.becomesHaunted();
    }

    public String enter(Visitor visitor){
        this.haunt(visitor);
        return "You hear the faint howling of the wind, and distant crackling in the surrounding woods. Welcome to the cemetary.";
    }
}
