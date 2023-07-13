package JavaAdvance.Leason3;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {


        File newFile = new File("/Users/macintosh/IdeaProjects/CBS/src/JavaAdvance/Leason3/NewFile.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("NewFile.txt"),(StandardCharsets.UTF_8)));



    }
}

//Завдання 2
//        Створіть файл, запишіть у нього довільні дані та закрийте файл.
//        Потім знову відкрийте цей файл, прочитайте дані і виведіть їх на консоль.