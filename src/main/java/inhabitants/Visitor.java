package inhabitants;

public class Visitor {

    private String name;
    private int age;
    private double height;
    private double purse;
    private boolean haunted;

    public Visitor(String name, int age, double height, double purse){
        this.name = name;
        this.age = age;
        this.height = height;
        this.purse = purse;
        this.haunted = false;
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

    public boolean isHaunted(){
        return this.haunted;
    }

    public void becomesHaunted(){
        this.haunted = true;
    }

    public void earns(double salary){
        this.purse += salary;
    }

    public void isCharged(double fee){
        this.purse -= fee;
    }
}
