package Abramyan;

import java.util.Scanner;

public class classWork {

    static void Perum(double a) {
        double P = 4 * a;
        System.out.println("Периметр " + P);

    }


    static void squrt(double a) {
        double S = Math.pow(a, 2);
        System.out.println("Площа дорівнює " + S);

    }

    static void longOfCircle(double R) {

        double L = 2 * (Math.PI * R);
        System.out.println("Довжина кола " + L);

    }

    static void sqrtOfCircle(double R) {
        double S = Math.PI * (Math.pow(R, 2));
        System.out.println(S);
    }


    static void uslovie(int a) {

        if (a > 0) {
            a++;
            System.out.println(a);
        } else
            System.out.println(a);

    }


    static void uslovie2(int a) {

        if (a > 0) {
            a++;
            System.out.println(a);
        } else {
            int tmp = a - 2;
            System.out.println(tmp);
        }
    }


    static void For1(int K, int N) {

        for (int i = 1; i <= N; i++) {
            System.out.println(K + " " + i);
        }
    }

    static void For2(int A, int B) {
        int tmp = 0;
        for (int i = A; i <= B; i++) {
            tmp++;
            System.out.println(i + " ітерація =" + tmp);
        }
        System.out.println("сума ітерацій =" + tmp);
    }


    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        Perum(a);
//        squrt(a);
//        uslovie(a);
//        longOfCircle(a);
//        sqrtOfCircle(a);
//        uslovie2(a);
//        For1(1234, 5);
//        For2(12, 30);


    }
}
