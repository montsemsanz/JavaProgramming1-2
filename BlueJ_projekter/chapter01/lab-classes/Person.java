
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    // The persons fullname.
    private String name;
    // The persons age.
    private int age;
    // The persons new age after birthday.
    private int birthday;
    // The persons IQ.
    private int iq;
    // The persons lover.
    private String lover;
    // The persons fiancee.
    private String fiancee;

    /**
     * Create a person with a given name and age.
     */
    public Person(String fullname)
    {
       name = fullname; 
       age = 0;
       iq = 0;
       lover = " ";
       fiancee = " ";
    }

    /**
     * Get the name of a person.
     */
    public String getName() 
    {
        return name;
    }
    
    /**
     * Set the age of the person.
     */
    public void setAge(int personAge)
    {
        age = 0 + personAge;
    }
    
    /**
     * Increase the persons age by one year. 
     */
    public int addBirthday()
    {
        return age + 1;
    }
    
    /**
     * Is the person a child.
     * Return true if person is child - otherwise false.
     */
     public boolean isChild()
     {
         return (0 <= age && age <= 17);
     }    
    
     /**
      * Is the person a pensioner.
      * Return true if person is pensioner - otherwise false.
      */
     public boolean isPensioner()
     {
         return (age > 67);
     }
     /**
      * Set the intelligence of the person. 
      */
     public void setIntelligence(int personIntelligence)
     {
         iq = 0 + personIntelligence;
     }
     
     /**
      * Get the intelligence of the person.
      */
     public int getIntelligence()
     {
         return iq;
     }    
     
     /** 
      * Decide if person is menzeaner.
      */
     public boolean isMenzeaner()
     {
         return (iq >= 140);
     }
        
     /**
      * Set the lover of a person (null if no lover).
      */
     public void setLover (String NewLover)
     {
         lover = NewLover;
     }
     
     /**
      * Get the lover of a person (null if no lover).
      */
     public String getLover()
     {
         if (lover != null);
         return lover;
     }    

     /**
      * Set the fiancee of a person (null if no fiancee).
      */
     public void setFiancee (String NewFiancee)
     {
         fiancee = NewFiancee;
     }
     
     /**
      * Get the fiancee of a person (null if no fiancee).
      */
     public String getFiancee()
     {
        if (fiancee != null);
         return fiancee;
     }    
      
     /**
	  * Person is a lousy person, if the person's lover is not the same as his/her fiancee.
	  * Note: the person is not lousy if the person doesn't have a lover or a fiancee.
      */
     public boolean isALousyPerson() 
     {
         if ((lover != fiancee) && (lover != null) && (fiancee != null));
         return true;
     }    
}
