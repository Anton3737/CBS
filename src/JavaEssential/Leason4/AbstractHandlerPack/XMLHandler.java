package JavaEssential.Leason4.AbstractHandlerPack;

public class XMLHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Ви відкрили XML документ");
    }

    @Override
    void create() {
        System.out.println("Ви створили XML документ");
    }

    @Override
    void change() {
        System.out.println("Ви змінили XML документ");
    }

    @Override
    void save() {
        System.out.println("Ви зберегли XML документ");
    }
}
