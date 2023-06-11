package JavaEssential.Leason4.Task5New;

public class CelsiusToKelvin implements ConverterTemperature{
    @Override
    public void convert(double value) {
        double K = value + 273.15;
        System.out.println("Згідно формули Tk = Tc + 273.15  конвертація з °С на °K становить: " + K);
    }

}
