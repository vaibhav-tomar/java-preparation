package vaibhav.systemdesign.designpattern.iteratordesignpattern;

import java.util.Arrays;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Book book1 = new Book("Hindi", 100);
        Book book2 = new Book("English", 200);
        Book book3 = new Book("Maths", 300);
        Book book4 = new Book("Science", 400);

        List<Book> books = Arrays.asList(book1, book2, book3, book4);
        Library library = new Library(books);
        Iterator iterator = library.createIterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book);
        }
    }
}
