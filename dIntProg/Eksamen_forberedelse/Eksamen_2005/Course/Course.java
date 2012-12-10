
/**
 * Write a description of class Course here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Course
{
    private String courseID;
    private String year;
    private String quarter;
    private int noOfStudents;

    /**
     * Constructor for objects of class Course
     */
    public Course(String cID, String y, String q, int nOS)
    {
        courseID = cID;
        year = y;
        quarter = q;
        noOfStudents = nOS;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return courseID + ", " + year + ", " + quarter + ", " + noOfStudents;
    }
    
    /**
     * 
     */ 
     public int getNoOfStudents()
     {
         return noOfStudents;
     }
     
     /**
      * 
      */ 
     public String getQuarter()
     {
         return quarter;
     }
     
     /**
      * 
      */ 
      public String getYear()
      {
          return year;
      }
}
