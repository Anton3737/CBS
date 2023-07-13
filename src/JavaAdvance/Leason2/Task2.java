package JavaAdvance.Leason2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static ArrayList<String> doubleValues(ArrayList<String> Arraylist) {
        ArrayList<String> newList = new ArrayList<>();
        for (String listing : Arraylist) {
            newList.add(listing);
            newList.add(listing);
        }
        System.out.println("Розмір подвоєного списку: " + newList.size());
        return newList;
    }

    public static void main(String[] args) throws IOException {
        // Первиний список який передається в параметри методу doubleValues()
        ArrayList<String> stringArrayList = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            System.out.println("Елемент: " + i);
            stringArrayList.add(bufferedReader.readLine());
        }

        System.out.println(doubleValues(stringArrayList));

        System.out.println("Розмір вихідного списку: " + stringArrayList.size());
        System.out.println(stringArrayList);

    }
}


//Завдання 2
//        Використовуючи колекцію, підвійте слово:
//        1. Введіть із клавіатури 5 слів до списку рядків.
//        2. Метод doubleValues повинен підвоювати слова за принципом a, b, c -> a, a, b, b, c, c.
//        3. Використовуючи цикл for виведіть результат на екран, кожне значення нового рядка.