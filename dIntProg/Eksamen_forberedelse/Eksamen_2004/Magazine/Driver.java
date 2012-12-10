
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    public static void exam()
    {
        Magazine m1 = new Magazine("Bo Bedre", 65);
        Magazine m2 = new Magazine("Alt for Damerne", 45);
        Magazine m3 = new Magazine("Sirene", 35);
        Magazine m4 = new Magazine("Cosmopolitan", 65);
        
//         System.out.println(m1 + "\n" + m2);
        
        Subscriber s = new Subscriber("Hanne Jensen");
        s.addMagazine(m1);
        s.addMagazine(m2);
        s.addMagazine(m3);
        s.addMagazine(m4);
        
        
//         s.listMagazines();
//         
        s.orderByName();
    }  
}
