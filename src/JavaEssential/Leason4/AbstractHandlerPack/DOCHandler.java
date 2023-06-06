package JavaEssential.Leason4.AbstractHandlerPack;

public class DOCHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Ви відкрили DOC документ");
    }

    @Override
    void create() {
        System.out.println("Ви створили DOC документ");
    }

    @Override
    void change() {
        System.out.println("Ви змінили DOC документ");
    }

    @Override
    void save() {
        System.out.println("Ви зберегли DOC документ");
    }
}
