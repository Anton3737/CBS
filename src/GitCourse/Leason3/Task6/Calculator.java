package GitCourse.Leason3.Task6;

import java.util.Scanner;

public class Calculator {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        System.out.println("Калькулятор з 4-ма операціями '+' '-' '*' '/' ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перший операнд");
        double operandOne = scanner.nextDouble();

        System.out.println("Введіть оператор (+ - * /) операнд");
        String operator = scanner.next();

        System.out.println("Введіть другий операнд");
        double operandTwo = scanner.nextDouble();

        switch (operator) {
            // необхідно дописати кейс додавання +
            case "+":
                double resAdd = operandOne + operandTwo;
                System.out.println(operandOne + " + " + operandTwo + " = " + resAdd);
                break;
            case "-":
                double resSub = operandOne - operandTwo;
                System.out.println(operandOne + " - " + operandTwo + " = " + resSub);
                break;
            case "/":
                if (operandTwo != 0) {
                    double resDiv = operandOne / operandTwo;
                    System.out.println(operandOne + " / " + operandTwo + " = " + resDiv);
                    break;
                } else {
                    System.out.println("На НУЛЬ ділити не можна!");
                    break;
                }
            case "*":
                double resMul = operandOne * operandTwo;
                System.out.println(operandOne + " * " + operandTwo + " = " + resMul);
                break;
            default:
                System.err.println(ANSI_RED + "Ви не ввели жодного з описаних операторів або ввели не відповідні умові символи що призвело до закінчення програми" +
                        "\n" +
                        "----------------------------------------------------ERROR------------------------------------------------------" + ANSI_RESET);
        }
    }
}

