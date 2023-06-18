package JavaStart.HomeWork006;

import java.util.Scanner;

public class SumMin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть число З якового почнеться відлік:");
        int A = sc.nextInt();
        System.out.println("Введіть число яким закінчиться відлік:");
        int B = sc.nextInt();

        System.out.println("{" + A + " <---> " + B + "}");

        int tmp = 0;
        for (int i = A; i <= B; i++) {
            tmp += i;
        }
        System.out.println("Сумма чисел в діапазоні: " + A + " та " + B + " складає: " + tmp);

        System.out.println("------------------------------------");


        System.out.println("{" + A + " <---> " + B + "}");
        System.out.println("Вивід непарних числел тобто частка яких не дорівнює != 0");
        for (int i = A; i <= B; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " | ");
            }
        }
    }
}


//Завдання 2
//        Використовуючи IntelliJ IDEA, створіть клас SumMin. Дано два числа A та B (A<B).
//        Виведіть суму всіх чисел, які розташовані між цими числами на екран.

//        Дано два числа A та B (A<B). Виведіть усі непарні значення, які розташовані між цими числами.
//
