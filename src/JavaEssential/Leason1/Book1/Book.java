package JavaEssential.Leason1.Book1;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Зтворюємо 3 екземпляри похідних класів
        // За допомогою мтоду СЕТ присвоємо їм дані через сканер
        System.out.println("Введіть заголовок книги");
        Title bookTitle = new Title();
        bookTitle.setTitleOfBook(sc.nextLine());
        System.out.println("Хто є автором");
        Author bookAuthor = new Author();
        bookAuthor.setAuthorOfBook(sc.nextLine());
        System.out.println("Введіть трохи контенту книги");
        Content bookContent = new Content();
        bookContent.setContentOfBook(sc.nextLine());


        //Отримуємо присвоєний результат чреез вивід даним в методі show()
        System.out.println("********************************");
        System.out.println("Назва: ");
        bookTitle.show();
        System.out.println("Від автора: ");
        bookAuthor.show();
        System.out.println("Текст: ");
        bookContent.show();
        System.out.println("********************************");

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