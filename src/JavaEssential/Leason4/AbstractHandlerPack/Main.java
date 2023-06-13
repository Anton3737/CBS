package JavaEssential.Leason4.AbstractHandlerPack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AbstractHandler abstractHandler;

//        AbstractHandler XMLHandler = new XMLHandler();
//        AbstractHandler TXTHandler = new TXTHandler();
//        AbstractHandler DOCHandler = new DOCHandler();

        Scanner sc = new Scanner(System.in);
        System.out.println("Виберіть один з 3х доступних форматів XML TXT DOC");
        String inputTypeOfDocument = sc.next();

        switch (inputTypeOfDocument) {
            case "XML":
                abstractHandler = new XMLHandler();
                abstractHandler.open();
                abstractHandler.change();
                abstractHandler.create();
                abstractHandler.save();

            case "TXT":
                abstractHandler = new TXTHandler();
                abstractHandler.open();
                abstractHandler.change();
                abstractHandler.create();
                abstractHandler.save();

            case "DOC":
                abstractHandler = new DOCHandler();
                abstractHandler.open();
                abstractHandler.change();
                abstractHandler.create();
                abstractHandler.save();

            default:
                System.err.println("Виникла проблема на етапі вибору типу документа");
        }


//        switch (inputTypeOfDocument) {
//            case "XML":
//                XMLHandler.open();
//                System.out.println("-------------------------------");
//                System.out.println("NEW - створює документ | BREAK - зупиняє програму");
//                String CreateDocumentXML = sc.next();
//                if (CreateDocumentXML.equals("NEW")) {
//                    XMLHandler.create();
//                } else if (CreateDocumentXML.equals("BREAK")) {
//                    System.err.println("Програму створення XML документу завершено");
//                    break;
//                }
//                System.out.println("-------------------------------");
//                System.out.println("Введіть текст для зміни документу:");
//                String ChangeDocumentXML = sc.next();
//                if (ChangeDocumentXML.equals(ChangeDocumentXML)) {
//                    System.out.println(ChangeDocumentXML);
//                    XMLHandler.change();
//                } else {
//                    System.err.println("Документ пустий ");
//                    System.err.println("Програму редагування XML документу завершено");
//                }
//                System.out.println("-------------------------------");
//                System.out.println("SAVE - зберігає документ | BREAK - зупиняє програму");
//                String SaveDocumentXML = sc.next();
//                if (SaveDocumentXML.equals("SAVE")) {
//                    XMLHandler.save();
//                } else if (CreateDocumentXML.equals("BREAK")) {
//                    System.err.println("Програму збереження XML документу завершено");
//                    break;
//                }
//                break;
//            case "TXT":
//                TXTHandler.open();
//                System.out.println("-------------------------------");
//                System.out.println("NEW - створює документ | BREAK - зупиняє програму");
//                String CreateDocumentTXT = sc.next();
//                if (CreateDocumentTXT.equals("NEW")) {
//                    TXTHandler.create();
//                } else if (CreateDocumentTXT.equals("BREAK")) {
//                    System.err.println("Програму створення TXT документу завершено");
//                    break;
//                }
//                System.out.println("-------------------------------");
//                System.out.println("Введіть текст для зміни документу:");
//                String ChangeDocumentTXT = sc.next();
//                if (ChangeDocumentTXT.equals(ChangeDocumentTXT)) {
//                    System.out.println(ChangeDocumentTXT);
//                    TXTHandler.change();
//                } else {
//                    System.err.println("Документ пустий ");
//                    System.err.println("Програму редагування TXT документу завершено");
//                }
//                System.out.println("-------------------------------");
//                System.out.println("SAVE - зберігає документ | BREAK - зупиняє програму");
//                String SaveDocumentTXT = sc.next();
//                if (SaveDocumentTXT.equals("SAVE")) {
//                    TXTHandler.save();
//                } else if (CreateDocumentTXT.equals("BREAK")) {
//                    System.err.println("Програму збереження TXT документу завершено");
//                    break;
//                }
//                break;
//            case "DOC":
//                DOCHandler.open();
//                System.out.println("-------------------------------");
//                System.out.println("NEW - створює документ | BREAK - зупиняє програму");
//                String CreateDocumentDOC = sc.next();
//                if (CreateDocumentDOC.equals("NEW")) {
//                    TXTHandler.create();
//                } else if (CreateDocumentDOC.equals("BREAK")) {
//                    System.err.println("Програму створення TXT документу завершено");
//                    break;
//                }
//                System.out.println("-------------------------------");
//                System.out.println("Введіть текст для зміни документу:");
//                String ChangeDocumentDOC = sc.next();
//                if (ChangeDocumentDOC.equals(ChangeDocumentDOC)) {
//                    System.out.println(ChangeDocumentDOC);
//                    TXTHandler.change();
//                } else {
//                    System.err.println("Документ пустий ");
//                    System.err.println("Програму редагування TXT документу завершено");
//                }
//                System.out.println("-------------------------------");
//                System.out.println("SAVE - зберігає документ | BREAK - зупиняє програму");
//                String SaveDocumentDOC = sc.next();
//                if (SaveDocumentDOC.equals("SAVE")) {
//                    TXTHandler.save();
//                } else if (CreateDocumentDOC.equals("BREAK")) {
//                    System.err.println("Програму збереження TXT документу завершено");
//                    break;
//                }
//                break;
//            default:
//                System.err.println("Виникла проблема на етапі вибору типу документа");
//        }
    }
}


