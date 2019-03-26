public class Visitor {

    private String name;
    private int age;
    private double height;
    private double purse;

    public Visitor(String name, int age, double height, double purse){
        this.name = name;
        this.age = age;
        this.height = height;
        this.purse = purse;
    }

    public Object getName(){
        return this.name;
    }

    public int getAge(){
        return age;
    }

    public double getHeight(){
        return height;
    }

    public double getPurse(){
        return purse;
    }
}
