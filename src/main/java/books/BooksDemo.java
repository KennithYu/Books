package books;

/**
 *
 * @author Kennith Yu
 */
public class BooksDemo {
    public static void main(String[] args) {
        PersonFactory personFactory = PersonFactory.getInstance();
        BookFactory bookFactory = BookFactory.getInstance();
        
        Person bradThor = personFactory.getPerson(PersonType.AUTHOR, "Brad Thor", "brad,thor@authors.com", "Male");
        bradThor.initialize("Marvel Publishing");
        Book nearDark = bookFactory.getBook(BookType.BOOK, "Near Dark", 14.99, bradThor);
        Book backLash = bookFactory.getBook(BookType.BOOK, "Backlash", 8.99, bradThor);
        Book lionsOfLucerne = bookFactory.getBook(BookType.BOOK, "The Lions of Lucerne", 12.99, bradThor);
        Book spyMaster = bookFactory.getBook(BookType.BOOK, "Spy Master", 8.99, bradThor);
        Book pathAssassin = bookFactory.getBook(BookType.BOOK, "Path of the Assassin", 12.99, bradThor);
        
        System.out.println("\t\t\t\t Books!");
        System.out.println(nearDark.toString() + "\t" + nearDark.getAuthor().toString());
        System.out.println(backLash.toString() + "\t" + backLash.getAuthor().toString());
        System.out.println(lionsOfLucerne.toString() + "\t" + lionsOfLucerne.getAuthor().toString());
        System.out.println(spyMaster.toString() + "\t" + spyMaster.getAuthor().toString());
        System.out.println(pathAssassin.toString() + "\t" + pathAssassin.getAuthor().toString());
    }
}
