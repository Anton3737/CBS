package JavaEssential.Leason1.RectanglePack;


import java.util.Scanner;

import static java.lang.Math.*;

public class Rectangle {

    public double side1;
    public double side2;


    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

//    static double areaCalculator(double side1, double side2) {
//        double areaCalc = side1 * side2;
//        return areaCalc;
//    }
//
//    static double perimeterCalculator(double side1, double side2) {
//        double perimeterCalc = pow(side1, 2) + pow(side2, 2);
//        return perimeterCalc;
//    }

    static double areaCalculatorWithObject(Rectangle MostOfTheBestRectangle) {
        double areaCalc = MostOfTheBestRectangle.side1 * MostOfTheBestRectangle.side2;
        return areaCalc;
    }

    static double perimeterCalculatorWithObject(Rectangle MostOfTheBestRectangle) {
        double perimeterCalc = pow(MostOfTheBestRectangle.side1, 2) + pow(MostOfTheBestRectangle.side2, 2);
        return perimeterCalc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle MostOfTheBestRectangle = new Rectangle(sc.nextDouble(), sc.nextDouble());

        System.out.println("Площа " + areaCalculatorWithObject(MostOfTheBestRectangle));
        System.out.println("Периметр " + perimeterCalculatorWithObject(MostOfTheBestRectangle));


//        System.out.println("Площа прямокутника: " + areaCalculator(2, 3));
//        System.out.println("Периметр прямокутника: " + perimeterCalculator(12, 91));
    }
}

//Завдання 2
//        Використовуючи IDEA, створіть проект із пакетом.+
//        Потрібно: Створити клас із ім'ям Rectangle. +
//        У тілі класу створити два поля, що описують довжини сторін double side1, double side2.+
//        Створити два методи,
//        що обчислюють площу прямокутника - double areaCalculator (double side1, double side2) і
//        периметр прямокутника - double perimeterCalculator (double side1, double side2).
//        Написати програму, яка приймає від користувача довжини двох сторін прямокутника і
//        виводить на екран периметр та площу.

