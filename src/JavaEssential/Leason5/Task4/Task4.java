package JavaEssential.Leason5.Task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Введіть елемент списку: " + i + " з " + "10");
            integerArrayList.add(sc.nextInt());
            System.out.println(integerArrayList);
        }

        Iterator<Integer> integerIterator = integerArrayList.iterator();

        while (integerIterator.hasNext()) {
            Integer integer = integerIterator.next();
            System.out.println(integer + 1);
        }
    }
}

//Завдання 4
//        Використовуючи Intelij IDEA, створити проект, пакет.
//        Створити клас Main, створити список цілих чисел і за допомогою ListIterator
//        пройтись по списку і збільшити значення на 1.