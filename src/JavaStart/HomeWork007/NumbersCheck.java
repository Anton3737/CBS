package JavaStart.HomeWork007;

import java.util.Scanner;

public class NumbersCheck {

    //        1)      чи є введене число позитивним, чи негативним; +
    static void inputNumberHigherThenZero(double inputNumber) {
        if (inputNumber > 0) {
            System.out.println("Введене число є додатнім і має значення що > 0");
        } else if (inputNumber < 0) {
            System.err.println("Введене число є від'ємним і має значення що < 0");
        } else if (inputNumber == 0) {
            System.out.println("Введене число є рівним 0");
        }
    }

    static void naturalNumber(double inputNumber) {
        if (inputNumber > 1) {
            for (int i = 2; i < inputNumber; i++) {
                if (inputNumber % 2 == 0 || inputNumber % 1 == inputNumber) {
                    System.out.println("Число не є простим");
                    break;
                } else {
                    System.out.println("Число просте");
                    break;
                }
            }
        } else {
            System.out.println("Число менше 1");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inputNumber = sc.nextDouble();

        inputNumberHigherThenZero(inputNumber);

        naturalNumber(inputNumber);
    }


}


//Завдання 4
//        Використовуючи IntelliJ IDEA, створіть клас NumbersCheck. Напишіть метод, який визначатиме:
//        1)      чи є введене число позитивним, чи негативним; +
//        2)      чи є воно простим (використовуйте техніку перебору значень).
//        Просте число – це натуральне число, яке ділиться на 1 й саме на себе.
//        Щоби визначити просте число чи ні, варто знайти всі його цілі дільники. Якщо дільників більше 2-х, то воно не просте;
//        3)      чи ділиться воно на 2, 5, 3, 6, 9 без залишку.