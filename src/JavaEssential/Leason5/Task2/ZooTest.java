package JavaEssential.Leason5.Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class ZooTest {
    public static void main(String[] args) {

//         Вирішив зробити не просто список з 8ма тваринками , а цикл в якому ми самі будемо обирати індекс вставлення та назву тваринки.
        ArrayList<String> animals = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть індекс:");
            int index = sc.nextInt();
            System.out.println("Введіть тварину:");
            String animal = sc.next();
            animals.add(index, animal);

            for (String Zoo : animals) {
                System.out.print(" " + Zoo);
            }
            System.out.println("\n(" + animals.size() + " елементів списку)");


            System.out.println(animals);
            System.out.println(animals.size());

            animals.remove(3);
            animals.remove(5);
            animals.remove(6);

            System.out.println(animals.size());
            System.out.println(animals);

        }
    }
}


//Завдання 2
//        Використовуючи Intelij IDEA, створити проект, пакет.
//        Створити клас Zoo. У класі створити список,
//        який записати 8 тварин через метод add(index, element). Вивести список у консоль.