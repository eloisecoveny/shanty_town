package stalls;

public class Horse {

    private String name;
    private BreedType breed;
    private double price;

    public Horse(String name, BreedType breed, double price){
        this.name = name;
        this.breed = breed;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public BreedType getBreed(){
        return this.breed;
    }

    public double getPrice(){
        return this.price;
    }
}
