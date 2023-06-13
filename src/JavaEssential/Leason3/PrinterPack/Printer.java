package JavaEssential.Leason3.PrinterPack;

import java.util.Scanner;

public class Printer implements Color {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    @Override
    public void print(String value) {
        System.out.println(value);
    }
}


//Завдання 6
//        Використовуючи IntelliJ IDEA, створіть проект. Потрібно:
//        Створити клас Printer.
//        У тілі класу створіть метод void print(String value), який виводить на екран значення аргументу.
//        Реалізуйте можливість того, щоб у разі успадкування від даного класу інших класів, та виклику
//        відповідного методу їх екземпляра, рядки, передані як аргументи методів, виводилися різними кольорами.
//        Обязательно используйте приведення типів.