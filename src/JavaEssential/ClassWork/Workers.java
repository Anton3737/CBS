package JavaEssential.ClassWork;

import java.util.Scanner;

public class Workers {

    private String name;
    private String secondName;
    private int age;

    private double salary;

    public Workers(String name, String secondName, int age, double salary) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Workers{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Workers Anatole = new Workers(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());

        System.out.println(Anatole);


        double prime = 0;
        if (Anatole.salary <= 2700) {
            prime = Anatole.salary * 0.2;
            Anatole.salary += prime;
            System.out.println(Anatole.salary);
        }


    }

}
