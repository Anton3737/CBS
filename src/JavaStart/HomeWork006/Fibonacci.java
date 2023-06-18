package JavaStart.HomeWork006;

import java.util.Scanner;

public class Fibonacci {


    static void Fibonacci(int input, int end) {
        if (input == 0) {
            System.out.println("Фібоначі числа 0 неможливе");
        }
        if (input > 2) {
            int n0 = 0;    //  число з якого починаємо відлік
            int n1 = 1;   //  число з якого починаємо відлік
            int tmp = 0;
            for (int i = n0; i < input; i++) {
                if (tmp < end) {      // в умові IF вказуємо до якого числа вивід
                    tmp = n0 + n1;   // сумма послвдовності на кожній ітерації
                    n0 = n1;
                    n1 = tmp;
                    System.out.print(tmp + " | ");
                } else if (input > end) {
                    System.out.println("Введене число відліку: " + input + " є більшим за кінцеве число заверешення: " + end);
                    break;
                }
            }
        } else {
            System.out.println("Введено некоректне значення");
        }
    }
    public static void main(String[] args) {
        Fibonacci(1, 10);
    }
}

//Завдання 9
//        Знайдіть послідовність Фібоначчі.
//        Одне стартове число користувач вводить,
//        друге вводить користувач до шуканого.


