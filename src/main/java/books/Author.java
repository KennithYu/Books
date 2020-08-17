package books;

/**
 * Author class inherits from Person class
 * @author Kennith Yu
 */
public class Author extends Person{
    private String publisherName;
    
    /**
     * Constructor with parameters that initializes all private members
     * Added by Kennith King Hay Yu
     */
    public Author(String name, String email, String gender, String publisherName) {
        super(name, email, gender);
        this.publisherName = publisherName;
    }
    
    /**
     * Constructor with parameters that initialize private members inherited from Person class
     * Added by Kennith King Hay Yu
     */
    public Author(String name, String email, String gender) {
        super(name, email, gender);
    }
    
    /**
     * Overridden initialize method from Person class
     * Intended to initialize publisherName private member that is unique to Author class
     * This helps Person objects of type Author that have been created through a factory
     * to initialize Author's unique private members.
     * Added by Kennith King Hay Yu
     */
    @Override
    public void initialize(String information) {
        this.publisherName = information;
    }

    /**
     * Overridden toString method 
     * Displays all private members, those inherited from Person class and unique members to Author class
     * Added by Kennith King Hay Yu
     */
    @Override
    public String toString() {
        return super.toString() + "\tPublisher: " + publisherName;
    }
    
}
