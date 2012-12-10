
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
        Artist a1 = new Artist("Kaare Norge", "guitarist", "verdensklasse", 10000);
        Artist a2 = new Artist("Miles Davies", "trompetist", "verdensklasse", 21000);
        Artist a3 = new Artist("Anders Pedersen", "bassist", "amatør", 2000); 
        Artist a4 = new Artist("Anne Sofie Mutter", "violinist", "verdensklasse", 23000);
        Artist a5 = new Artist("Allan Hansen", "sanger", "amatør", 1000);
        Artist a6 = new Artist("Søren Jensen", "bassist", "amatør", 1500);
        
        Event e = new Event();
        e.add(a1);
        e.add(a2);
        e.add(a3);
        e.add(a4);
        e.add(a5);
        e.add(a6);
        
        System.out.println("Kunstnere, der tager over 20000 for deres optræden: ");
        System.out.println(" " + e.noOfArtists(20000));
        
        System.out.println("Kunstnere, der vurderes som værende af verdensklasse: " +
        "\n" + " " + e.find("verdensklasse"));
        
        System.out.println("Kunstnere, ordnet efter niveau og navn: ");
        e.printArtists();
        
    }
}
