package Abramyan;

public class MyArea {
    final static double PI = Math.PI;

    static void Radius(double input){
        double res = PI * Math.pow(input,2);
        System.out.println(res);
    }

    public static void main(String[] args) {
        Radius(12);

    }

}



//    Створити клас MyArea, у ньому оголосити константу PI = 3.14 і статичний метод areaOfCircle, який має
//        приймати радіус, і, використовуючи PI, порахувати площу кола.
//        Створити клас Main, де запустити цей метод


