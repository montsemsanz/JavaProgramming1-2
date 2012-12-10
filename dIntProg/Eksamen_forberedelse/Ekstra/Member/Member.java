import java.util.*;
/**
 * Write a description of class Member here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Member implements Comparable<Member>
{
    private String name;
    private int age;
    private int points;

    /**
     * Constructor for objects of class Member
     */
    public Member(String n, int a, int p)
    {
        name = n;
        age = a;
        points = p;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return name + ", " + age + ", " + points;
    }
    
    /**
     * 
     */ 
     public int getPoints()
     {
         return points;
     }
     
     /**
      * 
      */
     public int getAge()
     {
         return age;
     }
     
     /**
      * 
      */ 
      public int compareTo(Member m)
      {
          return points - m.getPoints();
      }
}
