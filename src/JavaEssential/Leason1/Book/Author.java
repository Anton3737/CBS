package JavaEssential.Leason1.Book;

import java.awt.print.Book;

public class Author extends Book {
    private String authorOfBook;

    public Author(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    public String getAuthorOfBook() {
        return authorOfBook;
    }

    public void setAuthorOfBook(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    void show() {
        System.out.println(authorOfBook);
    }

}
