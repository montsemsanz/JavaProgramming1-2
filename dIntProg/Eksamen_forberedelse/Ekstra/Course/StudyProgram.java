import java.util.*;
/**
 * Write a description of class StudyProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudyProgram
{
    private String name;
    private List<Course> courses;

    /**
     * Constructor for objects of class StudyProgram
     */
    public StudyProgram(String n)
    {
        name = n;
        courses = new ArrayList<Course>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(Course c)
    {
        courses.add(c);
    }
    
    /**
     * 
     */
    public void remove(Course c)
    {
        courses.remove(c);
    }
    
    /**
     * 
     */
    public Course mostCrowded()
    {
        return Collections.max(courses, new StudentComparator());
    }
    
    /**
     * 
     */
    public int total(String quarter)
    {
        int total = 0;
        for(Course c : courses) {
            if(quarter.equals(c.getQuarter())) {
                total = total + c.getNoOfStudents();
            }
        }
        return total;
    }
    
    /**
     * 
     */
    public void printCourses()
    {
        Collections.sort(courses);
        for(Course c : courses) {
            System.out.println(" " + c);
        }
    }
}
