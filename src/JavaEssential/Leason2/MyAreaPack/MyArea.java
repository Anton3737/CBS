package JavaEssential.Leason2.MyAreaPack;

import java.util.Scanner;
import java.math.*;

import static java.lang.Math.PI;

public class MyArea {


    final double Pi = PI;


    static void areaOfCircleWithoutConstant(double R) {

        double S = 3.14 * (Math.pow(R, 2));

        System.out.println("Вивід площі кола без використання поля: " + S);
    }

    static void areaOfCircle(double R) {

        double S = PI * (Math.pow(R, 2));

        System.out.println("Вивід площі кола З використання поля PI : " + S);
    }


    static double areaOfCircleWithReturn(double R) {

        double S = PI * (Math.pow(R, 2));

        return S;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        areaOfCircle(sc.nextDouble());


        areaOfCircleWithoutConstant(sc.nextDouble());

        System.out.println("Через метод з повертаємим значенням: " + areaOfCircleWithReturn(sc.nextDouble()));


    }
}


//Завдання 5
//
//        Використовуючи Intelij IDEA, створити проект, пакет.
//        Створити клас MyArea, в ньому оголосити константу PI = 3.14 та статичний метод areaOfCircle,
//        який повинен приймати радіус та використовуючи PI порахувати площу кола.
//        Створити клас Main, де запустити цей метод.