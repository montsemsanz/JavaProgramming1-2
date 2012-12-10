
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
       Event e1 = new Event("2005-10-25", "Koncert", 18000, 4);
       Event e2 = new Event("2003-09-03", "Udstilling", 21500, 7);
       Event e3 = new Event("2005-10-25", "Koncert", 22000, 4);
       Event e4 = new Event("2003-09-03", "Udstilling", 23500, 7);
       Event e5 = new Event("2005-10-25", "Koncert", 15000, 4);
       Event e6 = new Event("2003-09-03", "Udstilling", 17500, 7);
       
       System.out.println(e1 + "\n" + e2);
       
       Festival f = new Festival();
       f.add(e1);
       f.add(e2);
       f.add(e3);
       f.add(e4);
       f.add(e5);
       f.add(e6);
       
       System.out.println("Antal arrangementer, d. 3. september 2003: " + "\n" +
       " " + f.noOfEvents("2003-09-03"));
       
       System.out.println("Oversigt over alle koncerter på listen: " + "\n" +
       " " + f.find("Koncert"));
       
       System.out.println("Alle events på listen ordnet efter type og pris: ");
       f.printEvents();
    }

}
