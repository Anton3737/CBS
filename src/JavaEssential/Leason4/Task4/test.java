//package OOPLeason12_13.Task2;
//
//import java.util.Scanner;
//
//public class ConverterTemperature implements ConverterInterface {
//    @Override
//    public void convertCelsiusToFahrenheit() {
//        System.out.println("Для розрахунку з °С на °F введіть значення температури:");
//
//        Scanner sc = new Scanner(System.in);
//
//        double C = sc.nextDouble();
//
//        double F = C / 5 * 9 + 35;
//
//        System.out.println("Згідно формули Tf = Tc / 5 * 9 + 32  конвертація з °С на °F становить: " + F
//                + "\n" + "-----------------------------------------------------------------------------");
//    }
//
//    @Override
//    public void convertCelsiusTotKelvin() {
//        System.out.println("Для розрахунку з °С на °K введіть значення температури:");
//
//        Scanner sc = new Scanner(System.in);
//
//        double C = sc.nextDouble();
//
//        double K = C + 273.15;
//
//        System.out.println("Згідно формули Tk = Tc + 273.15  конвертація з °С на °K становить: " + K
//                + "\n" + "-----------------------------------------------------------------------------");
//    }
//
//    @Override
//    public void convertFahrenheitToCelsius() {
//        System.out.println("Для розрахунку з °F на °C введіть значення температури:");
//
//        Scanner sc = new Scanner(System.in);
//
//        double F = sc.nextDouble();
//
//        double C = (F - 32) * 5 / 9;
//
//        System.out.println("Цельсій " + C);
//
//        System.out.println("Згідно формули Tc = (Tf – 32) * 5 / 9  конвертація з °F на °C становить: " + C
//                + "\n" + "-----------------------------------------------------------------------------");
//    }
//
//    @Override
//    public void convertFahrenheitToKelvin() {
//        System.out.println("Для розрахунку з °F на °K введіть значення температури:");
//
//        Scanner sc = new Scanner(System.in);
//
//        double F = sc.nextDouble();
//
//        double K = (F - 32) * 5 / 9 + 273.15;
//
//        System.out.println("Згідно формули Tk = (Tf – 32) * 5 / 9 + 273.15  конвертація з °F на °K становить: " + K
//                + "\n" + "-----------------------------------------------------------------------------");
//    }
//
//    @Override
//    public void convertKelvinToCelsius() {
//        System.out.println("Для розрахунку з °K на °C введіть значення температури:");
//
//        Scanner sc = new Scanner(System.in);
//
//        double K = sc.nextDouble();
//
//        double C = K - 273.15;
//
//        System.out.println("Згідно формули Tc = Tk – 273.15  конвертація з °K на °C становить: " + C
//                + "\n" + "-----------------------------------------------------------------------------");
//    }
//
//    @Override
//    public void convertKelvinToFahrenheit() {
//        System.out.println("Для розрахунку з °K на °F введіть значення температури:");
//
//        Scanner sc = new Scanner(System.in);
//
//        double K = sc.nextDouble();
//
//        double F = (K - 273.15) * 9 / 5 + 32;
//
//        System.out.println("Згідно формули Tf = (Tk – 273.15) * 9 / 5 + 32  конвертація з °K на °F становить: " + F
//                + "\n" + "-----------------------------------------------------------------------------");
//    }
//
//    public static void main(String[] args) {
//        ConverterTemperature converterTemperature = new ConverterTemperature();
//        converterTemperature.convertCelsiusToFahrenheit();
//        converterTemperature.convertCelsiusTotKelvin();
//        converterTemperature.convertFahrenheitToCelsius();
//        converterTemperature.convertFahrenheitToKelvin();
//        converterTemperature.convertKelvinToCelsius();
//        converterTemperature.convertKelvinToFahrenheit();
//    }
//}
//
////1) Цельсий  (Фаренгейт – Кельвин)
////        Tf = Tc / 5 * 9 + 32 +
////        Tk = Tc + 273.15    +
////        2) Фаренгейт  (Цельсий – Кельвин)
////        Tc = (Tf – 32) * 5 / 9
////        Tk = (Tf – 32) * 5 / 9 + 273.15
////        3) Кельвин  (Цельсий – Фаренгейт)
////        Tc = Tk – 273.15
////        Tf = (Tk – 273.15) * 9 / 5 + 32