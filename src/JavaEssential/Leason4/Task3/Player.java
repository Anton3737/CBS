package JavaEssential.Leason4.Task3;

import java.util.Scanner;

public class Player implements Playable, Recodable {


    @Override
    public void play() {
        System.out.println("Грає");
    }

    @Override
    public void record() {
        System.out.println("Записує");
    }

    @Override
    public void pause() {
        System.out.println("Пауза");
    }

    @Override
    public void stop() {
        System.out.println("Зупинити");
    }

    public static void main(String[] args) throws InterruptedException {

        Player SONYisPlay = new Player();

        Player SONYisRecord = new Player();


        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Запускаєм плеєр словом PLAY");
            String StartPlay = sc.next();
            if (StartPlay.equals("PLAY")) {
                System.out.println("Початок програвання треку");
                SONYisPlay.play();
            } else if (StartPlay.equals("REC")) {
                System.out.println("Початок запису треку");
                SONYisRecord.record();
            } else if (StartPlay.equals("STOPREC")) {
                System.out.println("Зупинка запису треку");
                SONYisRecord.record();
                SONYisPlay.stop();
            } else if (StartPlay.equals("STOPLAY")) {
                System.out.println("Зупинка треку");
                SONYisPlay.stop();
                SONYisRecord.record();
            } else if (StartPlay.equals("PAUSEPLAY")) {
                System.out.println("Поставити трек на паузу");
                SONYisPlay.pause();
                SONYisRecord.pause();
            } else if (StartPlay.equals("PAUSEREC")) {
                System.out.println("Поставити запис на паузу");
                SONYisPlay.pause();
                SONYisRecord.pause();
            }

        }
    }
}
