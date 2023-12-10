package tp2.Exo4_BookClass;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Book> bookList;

    public Bibliotheque() {
        bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void listBooks() {
        for (Book book : bookList) {
            System.out.println(book.getISBN());
        }
    }
}
