package JavaEssential.Leason4.Task3NEW;

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
}
