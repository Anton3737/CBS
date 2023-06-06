package JavaEssential.Leason4.AbstractHandlerPack;

public class TXTHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Ви відкрили TXT документ");
    }

    @Override
    void create() {
        System.out.println("Ви створили TXT документ");
    }

    @Override
    void change() {
        System.out.println("Ви змінили TXT документ");
    }

    @Override
    void save() {
        System.out.println("Ви зберегли TXT документ");
    }
}
