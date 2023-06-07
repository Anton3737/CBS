package JavaEssential.Leason4.Task4;

import java.util.Scanner;

public class ConverterTemperature extends AbstractConvertMethods {


    @Override
    double CelsiusToKelvin(double temperature) {
        return 0;
    }

    @Override
    double CelsiusToFarinhate(double temperature) {
        return 0;
    }

    @Override
    double KelvinToCelsius(double temperature) {
        return 0;
    }

    @Override
    double KelvinToFarinhate(double temperature) {
        return 0;
    }

    @Override
    double FarinhateToKelvin(double temperature) {
        return 0;
    }

    @Override
    double FarinhateToCelsius(double temperature) {
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        switch (sc.nextByte()) {
            case 1:


                break;
            case 2:


                break;
            case 3:


                break;
            case 4:


                break;
            case 5:


                break;
            case 6:


                break;
        }
    }
}
//        Цельсий  (Фаренгейт – Кельвин)
//        Tf = Tc / 5 * 9 + 32
//        Tk = Tc + 273.15
//        2) Фаренгейт  (Цельсий – Кельвин)
//        Tc = (Tf – 32) * 5 / 9
//        Tk = (Tf – 32) * 5 / 9 + 273.15
//        3) Кельвин  (Цельсий – Фаренгейт)
//        Tc = Tk – 273.15
//        Tf = (Tk – 273.15) * 9 / 5 + 32