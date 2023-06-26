package JavaEssential.Leason8.Task5;

import java.util.Objects;

public class Animal {

    private String name;
    private int age;
    private boolean tale;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTale() {
        return tale;
    }

    public void setTale(boolean tale) {
        this.tale = tale;
    }

    public Animal(String name, int age, boolean tale) {
        this.name = name;
        this.age = age;
        this.tale = tale;
    }

    @Override
    public String toString() {
        return
                "І'мя: " + name +
                        ", вік: " + age +
                        ", хвіст: " + tale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return age == animal.age && tale == animal.tale && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tale);
    }

    public static void main(String[] args) {

        Animal Vasilii = new Animal("Васька", 45, false);

        System.out.println(Vasilii);
        System.out.println(Vasilii.hashCode());

        Animal Liova = new Animal("Льова", 25, true);

        System.out.println(Liova);
        System.out.println(Liova.hashCode());


        System.out.println(Vasilii.equals(Liova));
        System.out.println(Liova.equals(Vasilii));

    }
}
