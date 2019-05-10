import java.util.Random;

/**
 * The Locker class.
 * 
 * <h2>Course Info:</h2>
 * ICS4U0 with Krasteva, V.
 *
 * @version 1.0, 19.04.24
 * @author Juleen Chen
 */
public class Locker
{
    int number;
    Student owner;
    private Jacket studentJacket;
    private Book books[];
    
    /**
     * Default constructor
     */
    public Locker(Student me)
    {
        number = (int)(300*Math.random());
        assignOwner(me);
        books = new Book [4]; 
        for (int i = 0; i < 4; i++) {
            books[i] = new Book ();
        }
        books[0].setTitle("Pearson Science for Physics");
        books[0].setCourse("SPH4U1");
        books[1].setTitle("Computer Engineering");
        books[1].setCourse("TEJ4M3");
        books[2].setTitle("Introduction to Financial Accounting");
        books[2].setCourse("BAF3ME");
        books[3].setTitle("Barron's AP Computer Science A");
        books[3].setCourse("ICS4U0");
    }
    
    /**
     * Gets a book from the locker and puts it in the owner's possession.
     */
    public Book getABook(String course)
    {
        for (int i = 0; i < 4; i++) {
            if (books[i]!=null && books[i].course.equals(course)) {
                for (int j = 0; j < 4; j++) {
                    if (owner.books[j]==null) {
                        Book temp = new Book();
                        temp.setTitle(books[i].title);
                        temp.setCourse(books[i].course);
                        books[i] = null;
                        return temp;
                    }
                }
            }
        }
        return null;
    }
    
    /**
     * Puts a book from the owner's possession into the locker.
     */
    public void putABook(Book book)
    {
        for (int i = 0; i < 4; i++) {
            if (owner.books[i].toString().equals(book.toString())) {
                for (int j = 0; j < 4; j++) {
                    if (books[j]==null) {
                        books[j] = owner.books[i];
                        owner.books[i] = null;
                        break;
                    }
                }
                break;
            }
        }
    }
    
    /**
     * Gets the jacket from the locker and puts it in the owner's possession.
     */
    public Jacket getJacket()
    {
        Jacket temp = studentJacket;
        studentJacket = null;
        return temp;
    }
    
    /**
     * Returns the jacket when it's checked.
     */
    public Jacket checkJacket()
    {
        return studentJacket;
    }
    
    /**
     * Puts the jacket into the locker, removing it from the owner's possession.
     */
    public void putJacket(Jacket myJacket)
    {
        studentJacket = myJacket;
        owner.myJacket = null;
    }
    
    /**
     * Assigns the locker's owner to the parameter me.
     */
    public void assignOwner(Student me)
    {
        owner = me;
    }
    
    /**
     * Returns a String representation of the locker number and owner.
     */
    public String toString()
    {
        return "Locker number " + number + " which belongs to " + owner;
    }
    
} // Locker class
