package books;

/**
 * Person abstract class
 * @author Kennith Yu
 */
public abstract class Person {
    protected String name;
    protected String email;
    protected String gender;

    /**
     * Constructor with parameters that initialize private members
     * Added by Kennith King Hay Yu
     */
    public Person(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    /**
     * initialize method that accepts parameter information as String
     * this method is intended for subclasses of Person class to initialize their unique private members
     * Added by Kennith King Hay Yu
     */
    public abstract void initialize(String information);

    /**
     * Overridden toString method to display Person information in a user-friendly format
     * Added by Kennith King Hay Yu
     */
    @Override
    public String toString() {
        return "Name: " + name + "\tEmail: " + email;
    }
 
}
