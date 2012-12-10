
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
        Scout s1 = new Scout("1990-05-17", "Bent Bak", 17);
        Scout s2 = new Scout("1991-03-18", "Carina Carstensen", 18);
        Scout s3 = new Scout("1992-05-06", "Frank Jepsen", 20);
        Scout s4 = new Scout("1993-09-04", "Johannes Andersen", 16);
        Scout s5 = new Scout("1994-08-15", "Britta Boel", 20);
        Scout s6 = new Scout("1999-11-25", "Anna Andersen", 20);
        
//         System.out.println(s1 + "\n" + s2);
//         
        ScoutGroup g1 = new ScoutGroup();
        g1.add(s1);
        g1.add(s2);
        g1.add(s3);
        g1.add(s4);
        g1.add(s5);
        g1.add(s6);
//                        
//         System.out.println("Totale antal: " +
//         g1.totalMarks());
        
//         System.out.println("Spejdere med over 18 mærker:" + g1.find(18));
//         
        g1.printScouts();
    }
}
