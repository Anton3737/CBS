package JavaEssential.Leason2.CarPackTask2;

public class Car {

    int year;
    String color;


    public Car() {
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }


    Car Nisan = new Car();
    Car Mazda = new Car(1998);
    Car Toyota = new Car(1991, "Red");
    Car Honda = new Car("Blue");


}


//Завдання 2
//
//        Використовуючи Intelij IDEA, створити проект, пакет.
//        Створити клас Машина з полями рік(int), колір(String).
//        Створити конструктор за замовчуванням, конструктор з одним і 2 параметрами.
//        Створити клас Main в якому створити екземпляри, викликаючи різні конструктори.