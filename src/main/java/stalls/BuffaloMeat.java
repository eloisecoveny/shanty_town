package stalls;

public class BuffaloMeat extends Item {

    private BuffaloBodyPart type;

    public BuffaloMeat(BuffaloBodyPart type){
        this.type = type;
    }

    public double getPrice(){
        return this.type.getCost();
    }
}
