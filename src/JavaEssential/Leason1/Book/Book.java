package JavaEssential.Leason1.Book;

import java.util.Scanner;

public class Book {

    Book Author;
    Book Title;
    Book Content;

    public Book(Book author, Book title, Book content) {
        Author = author;
        Title = title;
        Content = content;
    }

//    public Book() {
//
//    }

    public void setAuthor(Book author) {
        Author = author;
    }

    public void setTitle(Book title) {
        Title = title;
    }

    public void setContent(Book content) {
        Content = content;
    }

    public Book getAuthor() {
        return Author;
    }

    public Book getTitle() {
        return Title;
    }

    public Book getContent() {
        return Content;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть назву книжки");
        Title BookTitle = new Title();
        BookTitle.setTitleOfBook(sc.nextLine());
        System.out.println("Введіть автора тексту");
        Author BookAuthor = new Author();
        BookAuthor.setAuthorOfBook(sc.nextLine());
        System.out.println("Введіть контент");
        Content BookContent = new Content();
        BookContent.setContentOfBook(sc.nextLine());


//        Book Book = new Book();
//        Book.getTitle();
//        Book.getAuthor();
//        Book.getContent();


//
//        System.out.println(BookTitle.getTitleOfBook());
//        System.out.println(BookAuthor.getAuthorOfBook());
//        System.out.println(BookContent.getContentOfBook());

    }
}
//Завдання 3
//        Використовуючи IDEA, створіть проект із пакетом. +
//        Потрібно: Створити клас Book (Main). +
//        Створити класи Title, Author та Content, +
//        кожен з яких повинен містити одне рядкове поле та метод void show(). +
//        Реалізуйте можливість додавання до книги назви книги, імені автора та змісту.
//        Виведіть на екран за допомогою методу show() назву книги, ім'я автора та Зміст.

//Завдання 3
//        Хотілося б ще побачити відповідні поля у класі книги,
//        та відповідну ініціалізацію обʼєкту класу книги
//        Не рекомендую вам дослівно кодити умову завдання,
//        бо там буває дичина написана. Думайте над своїми рішеннями у коді усміхаюсь