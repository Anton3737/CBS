package JavaEssential.Leason3.VehiclePack;

public class Ship extends Vehicle {
    private int Passengers;
    private String basedPort;

    public Ship(int price, int speed, int year, int passengers, String basedPort) {
        super(price, speed, year);
        Passengers = passengers;
        this.basedPort = basedPort;
    }

    public int getPassengers() {
        return Passengers;
    }

    public void setPassengers(int passengers) {
        Passengers = passengers;
    }

    public String getBasedPort() {
        return basedPort;
    }

    public void setBasedPort(String basedPort) {
        this.basedPort = basedPort;
    }
}
