package CoursProject;

import java.util.Scanner;

public class Task1 {

//    static int methodSumNumber(int inputNumber) {
//
//        int tmpRes;
//        int sumRes = 0;
//        for (; inputNumber > 0; inputNumber /= 10) {
//            tmpRes = inputNumber % 10;
//
//            if (tmpRes != 0) {
//                sumRes += tmpRes;
//            } else {
//                System.err.println("Число містить 0");
//                break;
//            }
//
//            System.out.println(tmpRes);
//
//        }
////        return methodSumNumber();
//    }


    static void reversMethod(int input) {

        int tmpRes;
        int sumIteration;
        for (; input > 0; input /= 10) {
            tmpRes = input % 10;
            if (tmpRes == 0) {
                System.err.println("Існує НУЛЬ\n");
                break;
            } else {

                System.out.print(tmpRes);
            }

        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputNumb = scanner.nextInt();
        System.out.println("Ви ввели: " + inputNumb);

        reversMethod(inputNumb);

//        System.out.println("Результатом суми чисел буде " + methodSumNumber(inputNumb));


    }
}


//Завдання 2
//        Напишіть метод, який приймає число, яке не містить нулів та повертає цифри у зворотному порядку.
//        Наприклад, на вхід 789, на вихід 987.

//Створити метод з додаванням числа для кількості комірок
