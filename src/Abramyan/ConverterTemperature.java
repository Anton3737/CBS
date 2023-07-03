package Abramyan;

public class ConverterTemperature {


    public void ConverterTemperature(double inputCels) {

        double Tf = inputCels / 5 * 9 + 32;
        double Tk = inputCels + 273.15;
        System.out.println(Tf);
        System.out.println(Tk);

    }

    public static void main(String[] args) {
        ConverterTemperature converterTemperature = new ConverterTemperature();
        converterTemperature.ConverterTemperature(32);
    }
}


//    Напишіть клас ConverterTemperature для конвертації з градусів за Цельсієм в Кельвіни, Фаренгейти. Клас
//        має мати метод convert, який і робить конвертацію.

//Цельсий  (Фаренгейт – Кельвин)
////        Tf = Tc / 5 * 9 + 32
////        Tk = Tc + 273.15