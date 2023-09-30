package JavaEssential.Leason3.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ключ доступу:");
        String inputKey = sc.next();

        if (inputKey.equals("user")) {
            DocumentWorker documentWorker = new DocumentWorker();
            documentWorker.openDocument();
            documentWorker.editDocument();
            documentWorker.saveDocument();
        }
        if (inputKey.equals("pro")) {
            DocumentWorker PROdocumentWorker = new ProDocumentWorker();
            PROdocumentWorker.openDocument();
            PROdocumentWorker.editDocument();
            PROdocumentWorker.saveDocument();
        }
        if (inputKey.equals("exp")) {
            DocumentWorker EXPdocumentWorker = new ExpertDocumentWorker();
            EXPdocumentWorker.openDocument();
            EXPdocumentWorker.editDocument();
            EXPdocumentWorker.saveDocument();
        }
    }
}

//Завдання 4
//        Використовуючи IntelliJ IDEA, створіть проект.
//        Потрібно: Створити клас DocumentWorker. +
//        У тілі класу створіть три методи openDocument(), editDocument(), saveDocument().  +
//        У тілі кожного з методів додайте виведення на екран відповідних рядків:
//        "Документ відкритий", +
//        "Правка документа доступна у версії Про", +
//        "Збереження документа доступне у версії Про". +
//        Створіть похідний клас ProDocumentWorker. +
//        Перевизначте відповідні методи, при перевизначенні методів виводьте наступні рядки:
//        "Документ відредаговано", +
//        "Документ збережено у старому форматі, збереження в інших форматах доступне у версії Експерт". +
//        Створіть похідний клас ExpertDocumentWorker від базового класу ProDocumentWorker. +
//        Перевизначте відповідний метод. +
//        При викликі даного методу необхідно виводити на екран документ збережений в новому форматі. +
//        У тілі методу Main() реалізуйте можливість прийому від користувача номер ключа доступу pro і exp. +
//        Якщо користувач не вводить ключ, він може користуватися тільки безкоштовною версією (створюється екземпляр базового класу), +
//        якщо користувач ввів номери ключа доступу pro і exp, то повинен створити екземпляр відповідної версії класу,
//        наведений до базового – DocumentWorker.