package GitCourse.Leason2.Task9;

import java.util.Scanner;

public class CalculatorClassForRew {
    // Крадена палітра для виділення помилки
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    // Точка входу в програму
    public static void main(String[] args) {
        System.out.println("Калькулятор з 4-ма операціями '+' '-' '*' '/' ");

        // Сканер для вводу даних в консоль
        Scanner scanner = new Scanner(System.in);

        // вводимо перший операнд
        System.out.println("Введіть перший операнд");
        double operandOne = scanner.nextDouble();

        // вводио оператор
        System.out.println("Введіть оператор (+ - * /) операнд");
        String operator = scanner.next();

        //вводимо другий операнд
        System.out.println("Введіть другий операнд");
        double operandTwo = scanner.nextDouble();

        // Використовуємо Цикл Свіч для вибірки наших операції
        switch (operator) {

            case "+":  // наша умова при якій має спрацьовувати необхідна операція
                double resAdd = operandOne + operandTwo;   // сама операція
                System.out.println(operandOne + " + " + operandTwo + " = " + resAdd); // вивід результату операції
                break;

            case "-":
                double resSub = operandOne - operandTwo;
                System.out.println(operandOne + " - " + operandTwo + " = " + resSub);
                break;

            case "/":
                // при умові ділення необхідно зформувати конструкцію для перевірки умови ділення на 0
                if (operandTwo != 0) {
                    double resDiv = operandOne / operandTwo;
                    System.out.println(operandOne + " / " + operandTwo + " = " + resDiv);
                    break;
                } else {
                    System.out.println(ANSI_RED + "Вай мееее ґенацвале, на нуль ділити не можна !!!" + ANSI_RESET);
                    break;
                }

            case "*":
                double resMul = operandOne * operandTwo;
                System.out.println(operandOne + " * " + operandTwo + " = " + resMul);
                break;

            default:
                System.out.println(ANSI_RED + "Ви не ввели жодного з описаних операторів або ввели не відповідні умові символи що призвело до закінчення програми" +
                        "\n" +
                        "----------------------------------------------------ОБПИБКА------------------------------------------------------" + ANSI_RESET);
        }
    }
}

