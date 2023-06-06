package JavaEssential.Leason3.VehiclePack;

public class Car extends Vehicle{

    private String color;
    private String name;

    public Car(int price, int speed, int year, String color, String name) {
        super(price, speed, year);
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
