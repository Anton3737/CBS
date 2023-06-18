package JavaEssential.Leason7;

import java.util.ArrayList;
import java.util.Scanner;

public class Worker {

    private String name;
    private String secondName;
    private String familyName;
    private int yearOfStart;

    public Worker(String name, String secondName, String familyName, int yearOfStart) {
        this.name = name;
        this.secondName = secondName;
        this.familyName = familyName;
        this.yearOfStart = yearOfStart;
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

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getYearOfStart() {
        return yearOfStart;
    }

    public void setYearOfStart(int yearOfStart) {
        this.yearOfStart = yearOfStart;
    }

    @Override
    public String toString() {
        return "Працівник:" +
                " Ім'я:" + name + '\'' +
                " По батькові:" + secondName + '\'' +
                " Прізвище:" + familyName + '\'' +
                " Час прийняття на роботу:" + yearOfStart;
    }

    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Scanner scanner = new Scanner(System.in);



        }




    }

    class ExceptionForAdd extends Exception {
        Exception msg = new Exception("Ви вели невірне значення дати старту роботи");

    }


}
