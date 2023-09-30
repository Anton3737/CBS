package SomeTask;

public class Engine {

    private int power;

    private String fuel;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }


    public String getFuelType() {
        return "A500";
    }

    public static void main(String[] args) {

        System.out.println(new Engine().getFuelType());

        AdvancedXFuelEngine engine = new AdvancedXFuelEngine();
        engine.setPower(1000);
        engine.setSerialNumber("SN504030");
        engine.printInfo(); //Serial number is SN504030, power is 1000

    }


}

class XFuelEngine extends Engine {

    protected String serialNumberl;

    public void setSerialNumber(String serialNumberl) {
        this.serialNumberl = serialNumberl;
    }

    @Override
    public String getFuelType() {
        return "XFuel";
    }
}

class AdvancedXFuelEngine extends XFuelEngine {

    public void printInfo() {
        System.out.println("Serial number is " + serialNumberl + ", power is " + getPower() + "");
    }



}