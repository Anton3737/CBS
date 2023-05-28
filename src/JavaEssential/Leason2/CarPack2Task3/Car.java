package JavaEssential.Leason2.CarPack2Task3;

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

        Car Nissan = new Car(1985);
        Car Mercedes = new Car(1991, 220, 1500);
        Car Audi = new Car(2022, 340);
        Car Lexus = new Car(1998, 250, 1300, "Pink");
        Car Toyota = new Car(1998, 520, 900, "White");

    }
}


//Завдання 3
//
//        Використовуючи Intelij IDEA, створити проект, пакет.
//        (Наново!) Створити клас Машина з полями рік(int), швидкість(double), вага(int) колір(String).
//        Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-я, 4-а.
//        Перевантажити конструктори.
//        Створити клас Main, де створити екземляри класу Машина з різними параметрами.
