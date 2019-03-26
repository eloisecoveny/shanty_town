package stalls;

public enum BuffaloBodyPart {

    LEG(9.80),
    HEAD(2.20),
    BELLY(14.50);

    public final double price;

    BuffaloBodyPart(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

}
