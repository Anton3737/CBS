package CoursProject;

import java.util.Scanner;

public class Task2 {

    static void sumDataInform(String input) {

        for (int i = 0; i < 10; i++) {
            System.out.print(input.charAt((byte) (i)) + " ");

        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("Ви ввели: " + input);

        sumDataInform(input);

    }
}

//Завдання 4
//        Створіть програму, яка виводить у консоль число дати. Наприклад, на вхід 02/11/1995 = 0 + 2 + 1 + 1 + 1 + 9 + 9 + 5 = 28, на вихід = 28.