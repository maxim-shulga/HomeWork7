package additional;
enum Vehicles {VW(12000, "red"), BMW(15000, "black");
    private final int cost;
    private final String color;
    private Vehicles (int cost, String color){
        this.cost = cost;
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    @Override
    public String toString(){
        return name() + " has "+ getColor() + " color and costs " + this.cost;
    }

}
public class Main {
    public static void main(String[] args) {
        Vehicles myCar = Vehicles.VW;
        Vehicles myCar2 = Vehicles.BMW;
        System.out.println(myCar);
        System.out.println(myCar.name() + " car has " + myCar.getColor() + " color");
        System.out.println(myCar2.name() + " car has " + myCar2.getColor() + " color");

    }
}
