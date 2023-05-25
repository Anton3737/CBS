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
                // Ганіна К., покращення:
                // System.out.println(operandOne + " " + operator + " " + operandTwo + " = " + resAdd);
                break;

            case "-":
                double resSub = operandOne - operandTwo;
                // Ганіна К., покращення:
                // System.out.println(operandOne + " " + operator + " " + operandTwo + " = " + resSub);
                break;

            case "/":
                // при умові ділення необхідно зформувати конструкцію для перевірки умови ділення на 0
                if (operandTwo != 0) {
                    double resDiv = operandOne / operandTwo;
                    // Ганіна К., покращення:
                    // System.out.println(operandOne + " " + operator + " " + operandTwo + " = " + resDiv);
                    break;
                } else {
                    System.out.println(ANSI_RED + "Вай мееее ґенацвале, на нуль ділити не можна !!!" + ANSI_RESET);
                    return;
                }

            case "*":
                double resMul = operandOne * operandTwo;
                // Ганіна К., покращення:
                // System.out.println(operandOne + " " + operator + " " + operandTwo + " = " + resMul);
                break;
                
            default:
                System.out.println(ANSI_RED + "Ви не ввели жодного з описаних операторів або ввели не відповідні умові символи що призвело до закінчення програми" +
                        "\n" +
                        "----------------------------------------------------ОБПИБКА------------------------------------------------------" + ANSI_RESET);
                return;
        }
        /*
        *Ганіна К.: видає помилку на рядку 72 через змінну resAdd
        *покращення: прибрати ряд 72 та написати команду виводу результату в case
        */
        System.out.println(operandOne + " " + operator + " " + operandTwo + " = " + resAdd); // вивід результату операції
    }
}

