package stalls;

public enum BuffaloBodyPart {

    LEG(9.80),
    HEAD(2.20),
    BELLY(14.50);

    public final double cost;

    BuffaloBodyPart(double cost){
        this.cost = cost;
    }

    public double getCost(){
        return this.cost;
    }

}
