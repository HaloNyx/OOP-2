/**
 * The Jacket class.
 * 
 * <h2>Course Info:</h2>
 * ICS4U0 with Krasteva, V.
 *
 * @version 1.0, 19.04.24
 * @author Juleen Chen
 */

public class Student
{
    String number;
    String name;
    Locker myLocker;
    Jacket myJacket;
    Book books[];
    
    /**
     * Constructor
     * @param String myName - name of the student
     */
    public Student(String myName)
    {
        name = myName;
        myLocker = new Locker(this);
        number = "" + myLocker.number;
        myJacket = new Jacket(this);
        books = new Book [4];
    }
    
    /**
     * The sent to office method gets called when the student is sent to the office
     */
    public void sentToOffice(String reason)
    {
        System.out.println(this + " was sent to the office because " + reason);
        if (reason.equals("they need to put their jacket in their locker.")) {
            this.myLocker.putJacket(myJacket);
        }
        else if (reason.contains("textbook")) {
            for (int i = 0; i < 4; i++) {
                if (books[i]==null) {
                    books[i] = this.myLocker.getABook(reason.substring(reason.indexOf("class")-7, reason.indexOf("class")-1));
                }
            }  
        }
    }
    
    /** 
     * Displays student information
     */
    public String toString()
    {
        return name;
    }
    
} // Student class
