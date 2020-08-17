package books;

/**
 * Singleton factory class
 * @author Kennith Yu
 */
public class PersonFactory {
    public static PersonFactory instance;
    
    private PersonFactory() {}
    
     public static PersonFactory getInstance() {
        if (instance == null) {
            instance = new PersonFactory();
        }
        return instance;
    }
     
    public Person getPerson (PersonType type, String name, String email, String gender) {
        switch (type) {
            case AUTHOR : return new Author(name, email, gender);
        }
        return null;
    }
}
