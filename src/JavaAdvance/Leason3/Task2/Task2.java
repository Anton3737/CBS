package JavaAdvance.Leason3.Task2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public class Task2 {
    public static void main(String[] args) throws IOException {
        LocalDateTime time = LocalDateTime.now();


        String text = "Мотря махнула на себе хусточкою, сіла на призьбі й задумалася. Ілько, пильно слідкуючи за нею, \n " +
                "проти волі задивився на красу її, що тепер іще якось виразніше виявлялася на сірому тлі стіни, \n" +
                "— на ту красу, що не б’є у вічі, що на перший погляд ледве примітна, а тільки в неї вдивишся, можна впитися \n" +
                "й очима, і серцем, всею істотою. То була краса, що виховується тільки на Україні, але не така, як малюють деякі \n" +
                "з наших письменників. Не було в неї ні «губок, як пуп’янок, червоних, як добре намисто», \n" +
                "ні «підборіддя, як горішок», ні «щік, як повна рожа», і сама вона не «вилискувалась, як маківка на городі». \n" +
                "Чорна, без лиску, товста коса; невисокий, трохи випнутий лоб; ніс тонкий, рівний, з живими ніздрями; \n" +
                "свіжі, наче дитячі, губи, що якось мило загинались на кінцях; легка смага на матових, наче мармурових, \n" +
                "щоках і великі, надзвичайно великі, з довгими віями, темно-сірі очі, з яких здавалося, дивлячись, наче \n" +
                "лилося якесь тихе, м’яке, ласкаве світло, — то була й уся краса сієї дівчини (В. Винниченко). \n" + time + "\n";


//        File newFile = new File("/Users/macintosh/IdeaProjects/CBS/src/JavaAdvance/Leason3/Task2/NewFileTask2.txt");
        File newFile = new File("src/JavaAdvance/Leason3/Task2/NewFileTask2.txt");
//        newFile.createNewFile();
        try (FileWriter fileWriter = new FileWriter(newFile, true)) {
            fileWriter.write(text);
            fileWriter.flush();
            fileWriter.close();
        }


        FileReader fileReader = new FileReader(newFile);

        // метод через масив
        char[] textSout = new char[text.length()];
        fileReader.read(textSout);

        for (char readFile : textSout) {
            System.out.print(readFile);
//            fileReader.close();
        }

        System.out.println("\n****************************************************************************************\n");
        // метод через BufferReader

        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String temp1 = null;
            while ((temp1 = bufferedReader.readLine()) != null) {
                System.out.println(temp1);
            }
            bufferedReader.close();
        }
    }
}

//Завдання 2
//        Створіть файл, запишіть у нього довільні дані та закрийте файл.
//        Потім знову відкрийте цей файл, прочитайте дані і виведіть їх на консоль.
