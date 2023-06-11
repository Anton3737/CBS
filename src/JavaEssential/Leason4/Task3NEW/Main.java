package JavaEssential.Leason4.Task3NEW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Playable SonyIsPlay = new Player();
        Recodable SonyIsRecord = new Player();

        SonyIsPlay.play();
        SonyIsPlay.pause();
        SonyIsPlay.stop();


        SonyIsRecord.record();
        SonyIsRecord.pause();
        SonyIsRecord.stop();


        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Запускаєм плеєр словом PLAY");
            String StartPlay = sc.next();
            if (StartPlay.equals("PLAY")) {
                System.out.println("Початок програвання треку");
                SonyIsPlay.play();
            } else if (StartPlay.equals("REC")) {
                System.out.println("Початок запису треку");
                SonyIsRecord.record();
            } else if (StartPlay.equals("STOPREC")) {
                System.out.println("Зупинка запису треку");
                SonyIsRecord.stop();
            } else if (StartPlay.equals("STOPLAY")) {
                System.out.println("Зупинка треку");
                SonyIsRecord.stop();
                SonyIsRecord.record();
            } else if (StartPlay.equals("PAUSEPLAY")) {
                System.out.println("Поставити трек на паузу");
                SonyIsPlay.pause();
                SonyIsRecord.pause();
            } else if (StartPlay.equals("PAUSEREC")) {
                System.out.println("Поставити запис на паузу");
                SonyIsPlay.pause();
                SonyIsRecord.pause();
            }

        }
    }
}