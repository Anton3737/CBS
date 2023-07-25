package JavaAdvance.Leason3.Task4;

import java.io.*;

public class Task4 {


    public static void main(String[] args) throws IOException {


        File File = new File("/Users/macintosh/IdeaProjects/CBS/src/JavaAdvance/Leason3/Task4/TextFileTask4.txt");
        FileReader fileReader = new FileReader("TextFileTask4.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String temp = null;
        while ((temp = bufferedReader.readLine()) != null) {
            System.out.println(temp);
        }
        bufferedReader.close();


    }

}

//Завдання 4
//        Створіть у пакеті текстовий файл і клас, внесіть у файл якийсь текст.
//        Виведіть на екран вміст файлу.