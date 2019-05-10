/**
 * The Book class.
 * 
 * <h2>Course Info:</h2>
 * ICS4U0 with Krasteva, V.
 *
 * @version 1.0, 19.04.24
 * @author Juleen Chen
 */

public class Book
{
    String title;
    String course;
    
    /**
     * Constructor that sets title and course to default values
     */
    public Book()
    {
        title = "";
        course = "";
    }
    
    /**
     * Sets the Book's title to the parameter thisTitle.
     */
    public void setTitle(String thisTitle)
    {
        title = thisTitle;
    }
    
    /**
     * Sets the Book's course to the parameter thisCourse.
     */
    public void setCourse(String thisCourse)
    {
        course = thisCourse;
    }
    
    /**
     * Returns a String representation of the book.
     */
    public String toString()
    {   
        return title + " for " + course;
    }
    
} // Book class
