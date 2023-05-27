package JavaEssential.Leason1.Book;

import java.awt.print.Book;

public class Title extends Book {

    private String titleOfBook;

    public Title(String titleOfBook) {
        this.titleOfBook = titleOfBook;
    }

    public String getTitleOfBook() {
        return titleOfBook;
    }

    public void setTitleOfBook(String titleOfBook) {
        this.titleOfBook = titleOfBook;
    }

    void show() {
        System.out.println(titleOfBook);
    }

}
