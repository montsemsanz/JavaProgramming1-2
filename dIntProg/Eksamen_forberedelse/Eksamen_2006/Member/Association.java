import java.util.*;
/**
 * Write a description of class Association here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Association
{
    private String name;
    private List<Member> members;

    /**
     * Constructor for objects of class Association
     */
    public Association(String n)
    {
        name = n; 
        members = new ArrayList<Member>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(Member m)
    {
        members.add(m);
    }
    
    /**
     * 
     */
    public void remove(Member m)
    {
        members.remove(m);
    }
    
    /**
     * 
     */ 
     public List<Member> selectGold()
     {
         List<Member> result = new ArrayList<Member>();
         for(Member m : members) {
             if(m.getPoints() > 100000) {
                 result.add(m);
             }
         }
         return result;
     }
     
     /**
      * 
      */
     public Member highScoreMember()
     {
         Member bestScoreYet = members.get(0);
         for(Member m : members) {
             if(m.getPoints() > bestScoreYet.getPoints()) {
                 m = bestScoreYet;
             }
         }
         return bestScoreYet;
     }
     
     /**
      * 
      */
     public void printMembers()
     {
         Collections.sort(members);
         for(Member m : members) {
             System.out.println(" " + m);
         }
     }
   
}
