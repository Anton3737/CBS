package JavaEssential.Leason6;

import java.util.ArrayList;

public enum Animals {

    LION(12), PANTHER(7), GEPARD(9), ELEPHANT(23), JIRAFFE(18), RACOON(1), ZEBRA(3), RINO(21), BEAR(27), CAPYBARA(4);
    int age;

    Animals(int age) {
        this.age = age;
    }



    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Тварикнка із зоопарку:" +
                " вік тварини: " + age + " років / рік ," + " з іменем " + name().toLowerCase();
    }

    public static void main(String[] args) {

        Animals Lion = Animals.LION;
        Animals Panther = Animals.PANTHER;
        Animals Gepard = Animals.GEPARD;
        Animals Elephant = Animals.ELEPHANT;
        Animals Jiraffe = Animals.JIRAFFE;
        Animals Racoon = Animals.RACOON;
        Animals Zebra = Animals.ZEBRA;
        Animals Rino = Animals.RINO;
        Animals Bear = Animals.BEAR;
        Animals Capybara = Animals.CAPYBARA;

        System.out.println(Lion);
        System.out.println(Panther);
        System.out.println(Gepard);
        System.out.println(Elephant);
        System.out.println(Jiraffe);
        System.out.println(Racoon);
        System.out.println(Zebra);
        System.out.println(Rino);
        System.out.println(Bear);
        System.out.println(Capybara);

    }
}

//        Завдання 2
//        Створіть проект за допомогою IntelliJ IDEA.
//        Створіть перерахунковий тип (enum) Animals, що містить конструктор, який повинен набувати цілого числа (вік тварини),
//        і містити перевантажений метод toString(), який повинен повертати назву екземпляра та вік тварини.

