package JavaEssential.Leason10;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface addition<T> {
    ArrayList<T> addMethod(List<T> input);
}

public class MyList implements addition {


    @Override
    public ArrayList<String> addMethod(List input) {
        List<String> newList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < input.size(); i++) {
            newList.add(scanner.next());
        }
        System.out.println("Розмір " + input.size());
        System.out.println(input);
        return (ArrayList<String>) newList;
    }


    public static void main(String[] args) {
        List list = new ArrayList<>();

        MyList myList = new MyList();
        myList.addMethod(list);


    }


}


//Завдання 2
//        Створіть проект за допомогою IntelliJ IDEA.+
//        Створіть клас MyList.+
//        Реалізуйте у найпростішому наближенні можливість використання його екземпляра аналогічно екземпляру класу List.
//        Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод додавання елемента,
//        індексатор для отримання значення елемента за вказаним індексом і властивість тільки для читання для отримання загальної кількості елементів.


//1. Інтерфейс з методом додавання
//2. Цикл додавання екземпляра в обєкт
//3. ртримання за індексом
//4. отримати суму елемантів