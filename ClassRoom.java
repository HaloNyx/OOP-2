/**
 * The ClassRoom class.
 * 
 * <h2>Course Info:</h2>
 * ICS4U0 with Krasteva, V.
 *
 * @version 1.0, 19.04.24
 * @author Juleen Chen
 */

public class ClassRoom {
    //Global variables
    private String courseCode;
    private String teacher;
    
    /**
     * Constructor that sets the courseCode and teacher
     */
    public ClassRoom (String cc, String teach) {
        courseCode = cc;
        teacher = teach;
    }
    
    /**
     * Checks whether a student can enter the class or not. If not, they are sent to the office.
     */
    public boolean enterClass (Student stu) {
        System.out.println(stu + " came to " + this + ".");
        if (stu.myJacket!=null) {
            stu.sentToOffice("they need to put their jacket in their locker.");
            return false;
        }
        
        boolean hasTextbook = false;
        for (int i = 0; i < 4; i++) {
            try {
                if (stu.books[i].course.equals(courseCode)) hasTextbook = true;
            }
            catch (NullPointerException e) {
            }
        }
        if (!hasTextbook) {
            stu.sentToOffice("they don't have their textbook for " + courseCode + " class.");
            return false;
        }
        return true;
    }
    
    /**
     * Returns a String representation of the course.
     */
    public String toString () {
        return "class " + courseCode + " taught by " + teacher;
    }
}