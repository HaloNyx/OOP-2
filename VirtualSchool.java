/**
 * The VirtualSchool class.
 * 
 * <h2>Course Info:</h2>
 * ICS4U0 with Krasteva, V.
 *
 * @version 1.0, 19.04.24
 * @author Juleen Chen
 */

public class VirtualSchool
{
    /**
     *  Demo test driver for the Crazy Objects problem
     */
    public static void main (String[] args)
    {   // Create a student and display
        Student me = new Student("Julian");
        System.out.println("Student: "+me+"\n"); 
        
        // Attempt to enter the classroom of Ms. Doe
        ClassRoom ics4u0 = new ClassRoom("ICS4U0", "Ms. Doe");
        while (!ics4u0.enterClass(me)) {
            System.out.println(me+" was not allowed into class.\n");
        }
        System.out.println(me+" was allowed into class.\n");
        
        // Attempt to enter the classroom of Mr. Strict
        ClassRoom tej4m3 = new ClassRoom("TEJ4M3", "Mr. Strict");
        while (!tej4m3.enterClass(me)) {
            System.out.println(me+" was not allowed into class.\n");
        }
        System.out.println(me+" was allowed into class.\n");
        
    } // main method
} // VirtualSchool class

