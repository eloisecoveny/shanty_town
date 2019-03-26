package stalls;

public enum BottleType {

    WHISKY(5.50),
    RUM(5.90),
    TEQUILA(7.10),
    BLACKBERRY_LIQUER(6.40),
    BLACK_DEATH(2.10);

    public final double price;

    BottleType(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }
}
