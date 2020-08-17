package books;

/**
 * Book class
 * @author Kennith Yu
 */
public class Book {
    private String title;
    private double price;
    private Person author;

    /**
     * Constructor with parameters that initializes private members
     * Added by Kennith King Hay Yu
     */
    public Book(String title, double price, Person author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    
    /**
     * Overridden toString method that displays Book's private members in a user-friendly way
     * Added by Kennith King Hay Yu
     */
    @Override
    public String toString() {
        return "Title: " + title + "\tPrice: " + price;
    }
}
