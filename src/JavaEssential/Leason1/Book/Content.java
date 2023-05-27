package JavaEssential.Leason1.Book;

import java.awt.print.Book;

public class Content extends Book {
    private String contentOfBook;

    public Content(String contentOfBook) {
        this.contentOfBook = contentOfBook;
    }

    public String getContentOfBook() {
        return contentOfBook;
    }

    public void setContentOfBook(String contentOfBook) {
        this.contentOfBook = contentOfBook;
    }

    void show() {
        System.out.println(contentOfBook);
    }

}
