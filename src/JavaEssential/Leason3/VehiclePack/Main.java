package JavaEssential.Leason3.VehiclePack;


public class Main {
    public static void main(String[] args) {

        Ship ship = new Ship(1300, 72, 2013, 3700, "Одеса");
        Plane plane = new Plane(520, 410, 2007, 2200, 150);
        Vehicle vehicle = new Vehicle(345, 75, 2002);
        Car car = new Car(12000, 340, 2017, "Pink", "Mercedes");

        System.out.println(ship.getPrice() + " " + ship.getSpeed() + " " + ship.getYear() + " " + ship.getPassengers() + " " + ship.getBasedPort());
        System.out.println(plane.getPrice() + " " + plane.getSpeed() + " " + plane.getYear() + " " + plane.getMaxHeight() + " " + plane.getPassengers());
        System.out.println(vehicle.getPrice() + " " + vehicle.getSpeed() + " " + vehicle.getYear());
        System.out.println(car.getPrice() + " " + car.getSpeed() + " " + car.getYear() + " " + car.getColor() + " " + car.getName());

    }
}

//Завдання 3
//        Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створити клас Vehicle.
//        У тілі класу створіть поля: координати та параметри суден (ціна, швидкість, рік випуску).
//        Створіть 3 похідних класи Plane, Саг та Ship.
//        Для класу Plane має бути визначена висота та кількість пасажирів.
//        Для класу Ship – кількість пасажирів та порт приписки.
//        Написати програму, яка виводить на екран інформацію про кожен засіб пересування.