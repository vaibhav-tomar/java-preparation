package vaibhav.systemdesign.designpattern.iteratordesignpattern;

import java.util.List;

public class Library {

    List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public Iterator createIterator() {
        return new BookIterator(this.books);
    }
}
