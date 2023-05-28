package JavaEssential.Leason2.CarPack3Task4;

public class Car {

    public int year;
    public double speed;
    public int weight;
    public String color;

    public Car() {
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public static void main(String[] args) {

        Car a = new Car();
        Car b = new Car();
        Car c = new Car();
        Car d = new Car();
        Car e = new Car();
        Car f = new Car();

    }
}


//Завдання 4
//
//        Використовуючи Intelij IDEA, створити проект, пакет. +
//        (Наново!) Створити клас Машина з полями рік(int), швидкість(double), вага(int) колір(String). +
//        Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-а, 4-а.
//        Перевантажити конструктори викликаючи конструктор із конструктора.
//        Створити клас Main, де створити екземляри класу Машина з різними параметрами.

