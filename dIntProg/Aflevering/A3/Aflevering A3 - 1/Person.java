
/**
 * Afleveringsopgave A3, 1 - keeping track of a person's lover and/or fiancee.
 * 
 * @author Susie 
 * @version 13.09.07
 */
public class Person
{
    // the person's name.
    private String name;
    // the person's age.
    private int age;
    // the person's lover.
    private Person lover;
    // the person's fiancee.
    private Person fiancee;
    
    /**
     * Create a person with possibly a lover and/or a fiancee. 
     */
    public Person(String fullname, int newage)
    {
        name = fullname;
        age = newage;
        lover = null;
        fiancee = null;
    }

    /**
     * Set the person's lover to newLover.
     */ 
    public void setLover(Person newLover)
    {
         lover = newLover;
    }
     
    /**
     * Get the person's lover (null if no lover).
     */
    public Person getLover()
    {
         if (lover != null) {
         return lover;
    }
         else {
             return null;
    }
}
    /**
     * Set the person's fiancee to newFiancee.
     */
    public void setFiancee(Person newFiancee)
    {
         fiancee = newFiancee;
    }
     
    /**
     * = the persons fiancee (null if no fiancee).
     */ 
    public Person getFiancee()
    {
         if (fiancee != null) {
            return fiancee;
    }
         else {
             return null;
    }
}
    
    /**
     * = if the persons lover is not the same as his/her fiancee.
     * 
     * Note: the person is not lousy if the person doesn't have 
     * a lover or a fiancee.
     */
    public boolean isALousyPerson() 
    {
    boolean isALousyPerson;
    if ((lover != fiancee) && (lover != null) && (fiancee != null)) 
    {
         isALousyPerson = true; }
         else isALousyPerson = false; 
            return isALousyPerson;
    }
 
     
    /**
     * = if the persons lover doesn't love the person 
     * or the person does not have a lover.
     */
    public boolean isHappy()
    {
        this.lover = lover;
        boolean isHappy;
        if((lover == null) || (lover.lover == this.lover))
        {
            isHappy = true; }
            else isHappy = false;
            return isHappy;
        }
    }        
        
     
     
     
