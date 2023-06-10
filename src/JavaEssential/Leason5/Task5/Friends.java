package JavaEssential.Leason5.Task5;

import java.util.*;

public class Friends {
    public static void main(String[] args) {
        // Створення списку
        ArrayList<String> FriendsList = new ArrayList<>();

        // Ініціалізація списку
        FriendsList.add("Катерина");
        FriendsList.add("Яніна");
        FriendsList.add("Оксана");
        FriendsList.add("Ельвіра");
        FriendsList.add("Еліна");
        FriendsList.add("Марія");
        FriendsList.add("Ніна");
        FriendsList.add("Анастасія");
        FriendsList.add("Любов");
        FriendsList.add("Валентина");
        FriendsList.add("Барбара");

        // Вивід ініціалізованого списку
        System.out.println(FriendsList);

        //Використовуємо клас Колекція де є реалізовані перевизначені методи Compare та Comparable
        // Сортуємо список за алфавітом
        Collections.sort(FriendsList);

        // Виводимо результат списку після сортування
        System.out.println(FriendsList);

    }
}

//Завдання 5
//        Використовуючи Intelij IDEA, створити клас Friends.
//        За допомогою методів ArrayList додати масив імена друзів.
//        Вивести список друзів, після вивести список друзів, відсортувавши в алфавітному порядку.