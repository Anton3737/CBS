package JavaEssential.Leason4.Task5New;

public class FarinhateToCelsius implements ConverterTemperature{
    @Override
    public void convert(double value) {
        double C = (value - 32) * 5 / 9;
        System.out.println("Згідно формули Tc = (Tf – 32) * 5 / 9  конвертація з °F на °C становить: " + C);
    }

}
