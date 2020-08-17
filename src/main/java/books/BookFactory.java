package books;

/**
 * Singleton factory class
 * @author Kennith Yu
 */
public class BookFactory {
    public static BookFactory instance;
    
    private BookFactory() {}
    
     public static BookFactory getInstance() {
        if (instance == null) {
            instance = new BookFactory();
        }
        return instance;
    }
     
    public Book getBook (BookType type, String title, double price, Person author) {
        switch (type) {
            case BOOK : return new Book(title, price, author);
        }
        return null;
    }
}
