package JavaStart.HomeWork009;

import java.util.Scanner;

public class ReversedArray {


    static int[] myReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
        }
        return array;
    }


    static int[] subArray(int[] array, int index, int count) {
        int[] newArray = new int[count];
        System.out.println("\n Відпрацювання методу int[] subArray");
        for (int i = index; i < count; i++) {
            System.out.print(array[i] + " ");
//            System.arraycopy(array, 0, newArray, 0, array.length);
        }
        return newArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            System.out.println("Введіть число яке бажаєте додати до масиву " + i + " /з " + array.length);
            array[i] = sc.nextInt();
        }

        for (int outArray : array) {
            System.out.print(outArray + " ");
        }

        myReverse(array);
//
        subArray(myReverse(array), 4, 20);


    }
}

//Завдання 3
//        Використовуючи IntelliJ IDEA, створіть клас ReversedArray.
//        Створити метод myReverse(int [] array), який приймає як аргумент масив цілочислових елементів
//        і повертає інвертований масив (елементи масиву у зворотному порядку). +

//        Створити метод int [] subArray (int [] array, int index, int count).
//        Метод повертає частину отриманого як аргумент масиву, починаючи з позиції,
//        яка зазначена в аргументі index, розмірністю, що відповідає значенню аргументу count.

//        Якщо аргумент count містить значення більше, ніж кількість елементів,
//        що входять до частини вихідного масиву (від зазначеного індексу index до індексу останнього елемента),
//        то під час формування нового масиву розмірністю в count, заповніть одиницями ті елементи,
//        які не були скопійовані з вихідного масиву.