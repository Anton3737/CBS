package JavaAdvance.Leason1.Task2;

import java.util.*;

class Number implements Comparable {
    int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "" + number;
    }

    @Override
    public int compareTo(Object o) {
        int tmp = this.number - ((Number) o).number;
        return tmp;
    }
}

public class Task2 {
    public static void main(String[] args) {

        ArrayList<Number> integerList = new ArrayList<>();
        integerList.add(new Number(4));
        integerList.add(new Number(12));
        integerList.add(new Number(71));
        integerList.add(new Number(32));
        integerList.add(new Number(3));
        integerList.add(new Number(51));
        integerList.add(new Number(93));
        integerList.add(new Number(1));
        integerList.add(new Number(87));
        integerList.add(new Number(25));
        System.out.println("size " + integerList.size());

        System.out.println("Вивід колекції через Ітератор");

        /** Інтерфейс ітерато<Клас обгортка для примітивів> ім'я ітератору = ім'я списку.виклик методу .iterator() **/
        Iterator<Number> integerIterator = integerList.iterator();
        // через цикл виводимо дані за допомогою методів .hasNext() та .next()
        while (integerIterator.hasNext()) {
            System.out.print(" " + integerIterator.next());
        }


        /** ТУТ Я ПОЧАВ ЕКСПЕРЕМЕНТУВАТИ **/


        System.out.println("\n");
        System.out.println("Вивід колекції через Ліст Ітератор в зворотньому порядку");

        ListIterator<Number> listIterator = integerList.listIterator(integerList.size());
        while (listIterator.hasPrevious()) {
            System.out.print(" " + listIterator.previous());
        }

        Number[] arr = new Number[integerList.size()];

        for (int i = 0; i < integerList.size(); i++) {
            arr[i] = integerList.get(i);
        }
        System.out.println("\n");
        System.out.println("Відсортована колекція про зростанню");

        Arrays.sort(arr);
        for (Number array : arr) {
            System.out.print(" " + array);
        }


    }
}
