import java.util.*;
/**
 * Write a description of class Klient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Klient 
{
       
    /**
     * Constructor for objects of class Klient
     */
    public Klient()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public List<Integer> spejlvendeHeltal()
    {
        Stack<Integer> listeHeltal = new ListStack<Integer>();
        listeHeltal.push(1);
        listeHeltal.push(2);
        listeHeltal.push(3);
        listeHeltal.push(4);
        listeHeltal.push(5);
      
        List<Integer> result = new ArrayList<Integer>();
        for(int i = listeHeltal.size(); 0 < i; i--) {
            result.add(listeHeltal.top());
            listeHeltal.pop();
        }
        return result;
    }
    
    /**
     * 
     */
    public List<String> spejlvendeStrenge()
    {
        Stack<String> listeStrenge = new ListStack<String>();
        listeStrenge.push("Det");
        listeStrenge.push("var");
        listeStrenge.push("en");
        listeStrenge.push("loerdag");
        listeStrenge.push("aften");
                
        List<String> result = new ArrayList<String>();
        for(int i = listeStrenge.size(); 0 < i; i--) {
            result.add(listeStrenge.top());
            listeStrenge.pop();
        }
        return result;
    }
}
