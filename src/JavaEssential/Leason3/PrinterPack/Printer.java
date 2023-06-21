package JavaEssential.Leason3.PrinterPack;

import java.util.Scanner;

public class Printer {

    String ANSI_RESET = "\u001B[0m";
    String ANSI_BLACK = "\u001B[30m";
    String ANSI_RED = "\u001B[31m";
    String ANSI_GREEN = "\u001B[32m";
    String ANSI_YELLOW = "\u001B[33m";
    String ANSI_BLUE = "\u001B[34m";
    String ANSI_PURPLE = "\u001B[35m";
    String ANSI_CYAN = "\u001B[36m";
    String ANSI_WHITE = "\u001B[37m";

    void print(String value) {
        System.out.println(value);
    }

    public static void main(String[] args) {

        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            String inputValue = sc.next();

            Printer printer;

            switch (inputValue) {
                case "black":
                    printer = new ColorBlack();
                    printer.print(inputValue);
                    break;
                case "red":
                    printer = new ColorRed();
                    printer.print(inputValue);
                    break;
                case "green":
                    printer = new ColorGreen();
                    printer.print(inputValue);
                    break;
                case "yellow":
                    printer = new ColorYellow();
                    printer.print(inputValue);
                    break;
                case "purple":
                    printer = new ColorPurple();
                    printer.print(inputValue);
                    break;
                case "blue":
                    printer = new ColorBlue();
                    printer.print(inputValue);
                    break;
                case "cyan":
                    printer = new ColorCyan();
                    printer.print(inputValue);
                    break;
                case "white":
                    printer = new ColorWhite();
                    printer.print(inputValue);
                    break;
                default:
                    System.out.println("Такий колір відсутній");
            }
        }
    }
}

class ColorBlack extends Printer {

    public void print(String value) {
        System.out.print(ANSI_BLACK + value + ANSI_RESET);
    }

}

class ColorRed extends Printer {

    public void print(String value) {
        System.out.println(ANSI_RED + value + ANSI_RESET);
    }
}

class ColorGreen extends Printer {
    public void print(String value) {
        System.out.println(ANSI_GREEN + value + ANSI_RESET);
    }
}

class ColorYellow extends Printer {

    public void print(String value) {
        System.out.println(ANSI_YELLOW + value + ANSI_RESET);
    }
}

class ColorBlue extends Printer {

    public void print(String value) {
        System.out.println(ANSI_BLUE + value + ANSI_RESET);
    }
}

class ColorPurple extends Printer {

    public void print(String value) {
        System.out.println(ANSI_PURPLE + value + ANSI_RESET);
    }
}

class ColorCyan extends Printer {

    public void print(String value) {
        System.out.println(ANSI_CYAN + value + ANSI_RESET);
    }
}

class ColorWhite extends Printer {

    public void print(String value) {
        System.out.println(ANSI_WHITE + value + ANSI_RESET);
    }
}


//Завдання 6
//        Використовуючи IntelliJ IDEA, створіть проект. Потрібно:
//        Створити клас Printer.
//        У тілі класу створіть метод void print(String value), який виводить на екран значення аргументу.
//        Реалізуйте можливість того, щоб у разі успадкування від даного класу інших класів, та виклику
//        відповідного методу їх екземпляра, рядки, передані як аргументи методів, виводилися різними кольорами.
//        Обязательно используйте приведення типів.