package stalls;

public class BottleOfLiquor extends Item {

    private BottleType type;

    public BottleOfLiquor(BottleType type){
        this.type = type;
    }

    public double getPrice(){
        return this.type.getPrice();
    }
}
