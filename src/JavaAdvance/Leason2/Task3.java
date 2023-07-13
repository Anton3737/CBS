package JavaAdvance.Leason2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task3 {


    static List<Integer> getIntegerList() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> integerList = new ArrayList<>();
        System.out.println("Розмір для заповнення N:");
        int N = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            System.out.println("Елемент: " + i);
            integerList.add(Integer.parseInt(bufferedReader.readLine()));
        }
        return integerList;
    }

    static int getMinimum(List<Integer> integerListing) {

        System.out.println("Вивід списку з методу getIntegerList переданого в параметр методу getMinimum: " + integerListing);
        int temp = integerListing.get(0);
        for (int i = 0; i < integerListing.size(); i++) {
            if (integerListing.get(i) <= temp) {
                temp = integerListing.get(i);
            }
            System.out.println("метод getMinimum з кількістю преданих елементів " + integerListing.size());
        }
        return temp;
    }


    public static void main(String[] args) throws IOException {

        getIntegerList();
        getMinimum(getIntegerList());


//        System.out.println("Вивід списку: " + linkedList + " " + ", Розміром в " + linkedList.size() + " елементів");


//        System.out.println("Додавання введених чисел в List у методі getIntegerList: " + getIntegerList());
//        getMinimum(getIntegerList());


    }
}


//Завдання 3
//        Мінімальне з N чисел (використовувати LinkedList):  +
//        1. Введіть із клавіатури число N.   +
//        2. Вважати N цілих чисел і заповнити ними список - метод getIntegerList.
//        3. Знайти мінімальне число серед елементів списку – метод getMinimum. +