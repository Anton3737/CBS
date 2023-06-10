package JavaEssential.Leason5.Task3;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        // Створення нового списку
        ArrayList<String> Zoo = new ArrayList<>();
        //Вивід розміру списку до ініціалізації
        System.out.println("Розмір вихідного списку: " + Zoo.size());
        //Вивід неініціалізованого списку одрасу після ініціалізації
        System.out.println("Вивід списку: " + Zoo);

        // Ініціалізація елементів списку
        Zoo.add(0, "Лев");
        Zoo.add(1, "Тигр");
        Zoo.add(2, "Пума");
        Zoo.add(3, "Ягуар");
        Zoo.add(4, "Жираф");
        Zoo.add(5, "Зебра");
        Zoo.add(6, "Слон");
        Zoo.add(7, "Носоріг");
        Zoo.add(8, "Капібара");

        //Вивід розміру списку після ініціалізації
        System.out.println(Zoo.size());
        //Вивід ініціалізованого списку одрасу після ініціалізації
        System.out.println(Zoo);

        //Видалення елементів спискіу звертаючись до індексу
        Zoo.remove(3);
        Zoo.remove(5);
        Zoo.remove(6);

        //Вивід розміру списку після ініціалізації та видалення елементів
        System.out.println(Zoo.size());
        //Вивід ініціалізованого списку одрасу після видалення елементів
        System.out.println(Zoo);
    }
}

//Завдання 3
//        Використовуючи Intelij IDEA, створити проект, пакет.
//        Використовуючи клас Zoo Завдання 2, видалити 3, 5, 7 тварин, дізнатися розмір списку і вивести в консоль.

