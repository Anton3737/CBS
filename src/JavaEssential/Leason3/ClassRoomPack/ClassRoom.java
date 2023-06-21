package JavaEssential.Leason3.ClassRoomPack;

import java.awt.*;
import java.util.ArrayList;

public class ClassRoom {

    ArrayList<Object> Child;

    Pupil[] pupils = new Pupil[4];

    public ClassRoom(Pupil p1, Pupil p2, Pupil p3, Pupil p4) {

        pupils[0] = p1;
        pupils[1] = p2;
        pupils[2] = p3;
        pupils[3] = p4;

    }

    public void show() {
        for (Pupil pup : pupils) {
            System.out.println(pup);
        }
    }

    public static void main(String[] args) {


        Pupil Yurii = new BadPupil("Юрій", "Корсун", 15, "Київ");
        System.out.println(Yurii);
        Yurii.read();
        Yurii.study();
        Yurii.relax();

        Pupil Eugen = new GoodPupil("Євгеній", "Бойко", 14, "Одеса");
        System.out.println(Eugen);
        Eugen.read();
        Eugen.study();
        Eugen.relax();

        Pupil Oksana = new ExcelentPupil("Оксана", "Іванова", 12, "Кривий ріг");
        System.out.println(Oksana);
        Oksana.read();
        Oksana.study();
        Oksana.relax();

        Pupil Angelina = new Pupil("Ангеліна", "Морозова", 13, "Суми");
        System.out.println(Angelina);
        Angelina.read();
        Angelina.study();
        Angelina.relax();




        ClassRoom classRoom = new ClassRoom(Yurii, Eugen, Oksana, Angelina);
        classRoom.show();

    }
}

//Завдання 2
//        Використовуючи IntelliJ IDEA, створіть проект. Потрібно:
//        Створити клас, який представляє навчальний клас ClassRoom. +
//        Створіть клас учень Pupil. +
//        У тілі класу створіть методи void study(), void read(), void write(), void relax(). +
//        Створіть 3 похідні класу ExcelentPupil, GoodPupil, BadPupil +
//        від класу базового класу Pupil і перевизначте кожен із методів, залежно від успішності учня. +
//        Конструктор класу ClassRoom приймає аргументи типу Pupil, клас має складатися із 4 учнів. +
//        Передбачте можливість, що користувач може передати 2 або 3 аргументи.  +
//        Виведіть інформацію про те, як усі учні екземпляра класу
//        ClassRoom вміють навчатися, читати, писати, відпочивати.
