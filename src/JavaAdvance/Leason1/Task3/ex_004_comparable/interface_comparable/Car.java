package JavaAdvance.Leason1.Task3.ex_004_comparable.interface_comparable;

import java.util.Collections;
import java.util.Comparator;

public class Car { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    //     Сортируем по скорости/цене
//    @Override
//    public int compareTo(Car o) {    // public int compareTo(Car o) {
//        int temp = this.speed - ((Car) o).speed;   // int temp = this.speed - o.speed;
//        if (temp == 0) {
//            return this.price - ((Car) o).price;
//        } else if (temp == 0)  {
//            return this.model.compareTo(model);
//        } else {
//            return this.color.compareTo(color);
//        }
//    }


//    @Override
//    public int compareTo(Car o) {
//        return this.speed - ((Car) o).speed;
//        return this.price - ((Car) o).price;
//        return this.model.compareTo(model);
//        return this.color.compareTo(color);
//        return 0;
//    }


    // Сортируем по скорости/цене
//    public int compareTo(Car o) {    // public int compareTo(Car o) {
//        int temp = this.speed - ((Car) o).speed;   // int temp = this.speed - o.speed;
//        if (temp == 0) {
//            return this.price - ((Car) o).price;
//        } else {
//            return temp;
//        }
//    }


    // Сравнение 2-х строковых значений
    // return this.model.compareTo((Car)o).model);
}