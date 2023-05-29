package JavaEssential.Leason1.Book;

import java.util.Scanner;

public class Book {

    private String titleOfBook;
    private String contentOfBook;
    private String authorOfBook;

    public Book(String titleOfBook, String contentOfBook, String authorOfBook) {
        this.titleOfBook = titleOfBook;
        this.contentOfBook = contentOfBook;
        this.authorOfBook = authorOfBook;
    }

    public String getTitleOfBook() {
        return titleOfBook;
    }

    public void setTitleOfBook(String titleOfBook) {
        this.titleOfBook = titleOfBook;
    }

    public String getContentOfBook() {
        return contentOfBook;
    }

    public void setContentOfBook(String contentOfBook) {
        this.contentOfBook = contentOfBook;
    }

    public String getAuthorOfBook() {
        return authorOfBook;
    }

    public void setAuthorOfBook(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть назву книжки");
        Book BookTitle = new Title("","","");
        System.out.println("Введіть автора тексту");
        Book BookAuthor = new Author("","","");
        System.out.println("Введіть контент");
        Book BookContent = new Content("","","");

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

//        System.out.println("*********************************************");
//        System.out.println("Тайтл");
//        title.show();
//        System.out.println("---------------------------------------------");
//        System.out.println("Автор");
//        author.show();
//        System.out.println("---------------------------------------------");
//        System.out.println("КонтЄнт");
//        content.show();
//        System.out.println("---------------------------------------------");
//        System.out.println("*********************************************");
