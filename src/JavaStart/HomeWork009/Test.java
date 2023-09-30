package JavaStart.HomeWork009;

import java.util.Scanner;

public class Test {


    static boolean perev(int a, int b, int c) {
        boolean tmp = ((a < b) && (b > c));
        return tmp;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(perev(a, b, c));
    }

//
//    static double gipotenuza(double a, double b) {
//
//        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//
//        return c;
//    }
//
//    static double perimetr(double a, double b) {
//        double P = a + b + gipotenuza(a, b);
//
//        return P;
//    }
//
//
//    public static void Main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println(gipotenuza(a, b));
//        System.out.println(perimetr(a, b));
//
//    }

}
