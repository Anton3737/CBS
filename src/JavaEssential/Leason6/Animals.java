package JavaEssential.Leason6;

import java.util.ArrayList;

public enum Animals {

    LION(12), PANTHER(7), GEPARD(9), ELEPHANT(23), JIRAFFE(18), RAC0ON(1), ZEBRA(3), RINO(21), BEAR(27), CAPYBARA(4);
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
                " вік тварини: " + age + " років / рік ,";
    }

    public static void main(String[] args) {

        Animals Lion = Animals.LION;
        Animals Panther = Animals.PANTHER;
        Animals Gepard = Animals.GEPARD;
        Animals Elephant = Animals.ELEPHANT;
        Animals Jiraffe = Animals.JIRAFFE;
        Animals Racoon = Animals.RAC0ON;
        Animals Zebra = Animals.ZEBRA;
        Animals Rino = Animals.RINO;
        Animals Bear = Animals.BEAR;
        Animals Capybara = Animals.CAPYBARA;


        System.out.println(Lion + " " + Lion.name());
        System.out.println(Panther + " " + Panther.name());
        System.out.println(Gepard + " " + Gepard.name());
        System.out.println(Elephant + " " + Elephant.name());
        System.out.println(Jiraffe + " " + Jiraffe.name());
        System.out.println(Racoon + " " + Racoon.name());
        System.out.println(Zebra + " " + Zebra.name());
        System.out.println(Rino + " " + Rino.name());
        System.out.println(Bear + " " + Bear.name());
        System.out.println(Capybara + " " + Capybara.name());

    }
}
