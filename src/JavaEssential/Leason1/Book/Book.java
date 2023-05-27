package JavaEssential.Leason1.Book;

import java.util.Scanner;

public class Book {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть назву книжки");
        Title title = new Title(sc.nextLine());
        System.out.println("Введіть автора тексту");
        Author author = new Author(sc.nextLine());
        System.out.println("Введіть контент");
        Content content = new Content(sc.nextLine());

        System.out.println("*********************************************");
        System.out.println("Тайтл");
        title.show();
        System.out.println("---------------------------------------------");
        System.out.println("Автор");
        author.show();
        System.out.println("---------------------------------------------");
        System.out.println("КонтЄнт");
        content.show();
        System.out.println("---------------------------------------------");
        System.out.println("*********************************************");
    }
}

//Завдання 3
//        Використовуючи IDEA, створіть проект із пакетом. +
//        Потрібно: Створити клас Book (Main). +
//        Створити класи Title, Author та Content, +
//        кожен з яких повинен містити одне рядкове поле та метод void show(). +
//        Реалізуйте можливість додавання до книги назви книги, імені автора та змісту.
//        Виведіть на екран за допомогою методу show() назву книги, ім'я автора та Зміст.
//
