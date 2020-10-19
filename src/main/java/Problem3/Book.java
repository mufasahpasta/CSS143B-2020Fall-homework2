package Problem3;

import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    // copy constructor
    public Book(Book anotherBook) {
        // homework
        id = anotherBook.id;
        title = anotherBook.title;
        author = anotherBook.author;
    }

    @Override
    public boolean equals(Object obj) {
        // homework
        if(obj != null && getClass() == obj.getClass()) // https://help.semmle.com/wiki/display/JAVA/Inherited+equals%28%29+in+subclass+with+added+fields
        {
            Book m = (Book) obj;
            return this.id.equals(m.id);
        }
        return false;
    }
}
