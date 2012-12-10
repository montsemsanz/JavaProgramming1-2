
/**
 * Person class - keeping track of lovers and fiancees.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    // the persons name.
    private String name;
    // the persons lover.
    private Person lover;
    // the persons fiancee.
    private Person fiancee;
    
    /**
     * Create a new person with a name, lover and fiancee. 
     */
    public Person(String myName)
    {
        name = myName;
        lover = null;
        fiancee = null;
    }

    /**
     * = the name of the person.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Set the person's lover to myLover.
     */ 
     public void setLover(Person myLover)
     {
         lover = myLover;
     }
     
     /**
      * = the persons lover (null if no lover).
      */
     public Person getLover()
     {
         if(lover != null);
         return lover;
     }
     
     /**
      * Set the person's fiancee to myFiancee.
      */
     public void setFiancee(Person myFiancee)
     {
         fiancee = myFiancee;
     }
     
     /**
      * = the persons fiancee (null if no fiancee).
      */ 
     public Person getFiancee()
     {
         if(fiancee != null);
         return fiancee;
     }
     
     /**
      * = the persons lover is not the same as his/her fiancee.
      * 
      * Note: the person is not lousy if the person doesn't have a lover or a fiancee.
      * 
      */
     public boolean isALousyPerson()
     {
     if((lover != fiancee) && (lover != null) && (fiancee != null)); 
     return true;
     }
}
