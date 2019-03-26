package attractions;

import inhabitants.Visitor;

public abstract class Attraction implements IEnter {

    private String name;

    public Attraction(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String enter(Visitor visitor){
        return null;
    }
}
