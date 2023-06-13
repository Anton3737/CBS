package JavaEssential.Leason3.ClassRoomPack;

public class ClassRoom extends Pupil {


    public ClassRoom(String name, String second_name) {
        super(name, second_name);
    }

    public ClassRoom(String name, String second_name, int age) {
        super(name, second_name, age);
    }

    public ClassRoom(String name, String second_name, int age, String city) {
        super(name, second_name, age, city);
    }

    public static void main(String[] args) {

        ClassRoom child = new ClassRoom("Yurii", "Boyko", 40, "Kiev");
        System.out.println(child);

        child.study();
        child.read();
        child.write();
        child.relax();
    }

}

//Завдання 2
//        Використовуючи IntelliJ IDEA, створіть проект. Потрібно:
//        Створити клас, який представляє навчальний клас ClassRoom.
//        Створіть клас учень Pupil.
//        У тілі класу створіть методи void study(), void read(), void write(), void relax().
//        Створіть 3 похідні класу ExcelentPupil, GoodPupil, BadPupil
//        від класу базового класу Pupil і перевизначте кожен із методів, залежно від успішності учня.
//        Конструктор класу ClassRoom приймає аргументи типу Pupil, клас має складатися із 4 учнів.
//        Передбачте можливість, що користувач може передати 2 або 3 аргументи.
//        Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom вміють навчатися, читати, писати, відпочивати.