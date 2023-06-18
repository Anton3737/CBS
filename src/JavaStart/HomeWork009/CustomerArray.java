package JavaStart.HomeWork009;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Внесіть кількість елементів масиву:");
        int numberOfArrayElement = sc.nextInt();

        int[] CustomerArray = new int[numberOfArrayElement];

        System.out.println("Довжина масиву складає: " + CustomerArray.length + " індексів");
        for (int i = 0; i < CustomerArray.length; i++) {
            System.out.println("Введіть число яке бажаєте додати до масиву " + i + " /з " + CustomerArray.length);
            CustomerArray[i] = sc.nextInt();
        }

        for (int array : CustomerArray) {
            System.out.print(array + " ");
        }

        System.out.println("\n");

        int tmpMax = CustomerArray[0];

        for (int i = 0; i < CustomerArray.length; i++) {
            if (CustomerArray[i] > tmpMax)
                tmpMax = CustomerArray[i];
        }
        System.out.println("Максимальне значення масиву становить = " + tmpMax);


        int tmpMin = CustomerArray[0];

        for (int i = 0; i < CustomerArray.length; i++) {
            if (CustomerArray[i] < tmpMin)
                tmpMin = CustomerArray[i];
        }
        System.out.println("Мінімальне значення масиву становить = " + tmpMin);

        int tmpSum = 0;

        for (int i = 0; i < CustomerArray.length; i++) {
            tmpSum = tmpSum + CustomerArray[i];
        }
        System.out.println("Сумма чисел масиву складає = " + tmpSum);

        double tmpAvg = 0;
        
        for (int i = 0; i < CustomerArray.length; i++) {
            tmpAvg += CustomerArray[i];
        }
        tmpAvg = tmpAvg / CustomerArray.length;
        System.out.println("Розмір масиву складає = " + CustomerArray.length);
        System.out.println("Середнє значення чисел масиву складає = " + tmpAvg);


        System.out.println("Парними числами масиву є: ");
        for (int i = 0; i < CustomerArray.length; i++) {
            int tmpParity = 0;
            if (CustomerArray[i] % 2 == 0) {
                tmpParity += CustomerArray[i];
                System.out.print(tmpParity + " ");
            }
        }
    }
}

//Завдання 2
//        Використовуючи IntelliJ IDEA, створіть клас CustomerArray.
//        Створити масив розміру N-елементів, заповнити його довільними цілими значеннями
//        (розмір масиву задає користувач).
//        Вивести на екран: найбільше значення масиву,
//        найменше значення масиву, загальну суму всіх елементів, середнє арифметичне всіх елементів, вивести всі непарні значення.