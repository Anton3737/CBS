package JavaEssential.Leason5.Task2;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        // Створення нового списку
        ArrayList<String> Zoo = new ArrayList<>();

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
        System.out.println("Розмір масиву " + Zoo.size());
        //Вивід ініціалізованого списку одрасу після ініціалізації
        System.out.println(Zoo);
    }
}

//Завдання 2
//        Використовуючи Intelij IDEA, створити проект, пакет.
//        Створити клас Zoo. У класі створити список, який записати 8 тварин через метод add(index, element).
//        Вивести список у консоль.