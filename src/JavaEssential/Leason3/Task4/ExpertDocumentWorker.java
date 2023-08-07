package JavaEssential.Leason3.Task4;

public class ExpertDocumentWorker extends ProDocumentWorker{

    @Override
    public void openDocument() {
        super.openDocument();
    }

    @Override
    public void editDocument() {
        super.editDocument();
    }

    @Override
    public void saveDocument() {
        System.out.println("EXP");
        System.out.println("Документ збережений в новому форматі");
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
