
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
        Actor a1 = new Actor("Ghita N�rby", 650000, 51); 
        Actor a2 = new Actor("Mads Mikkelsen", 500000, 35); 
        Actor a3 = new Actor("Jonathan Spangsberg", 300000, 25); 
        Actor a4 = new Actor("Johanne Heiberg", 1000000, 72);
        Actor a5 = new Actor("Mia Lyhne", 400000, 30); 
        Actor a6 = new Actor("J�rgen Reenberg", 1200000, 87);
        Actor a7 = new Actor("Jens Henriksen", 400000, 35);
        Actor a8 = new Actor("Anja S�rensen", 600000, 35);
        
        System.out.println(a1 + "\n" + a2 + "\n" + a3);
        
        Ensemble e = new Ensemble("Det kongelige teater");
        e.add(a1);
        e.add(a2);
        e.add(a3);
        e.add(a4);
        e.add(a5);
        e.add(a6);
        e.add(a7);
        e.add(a8);
        
        System.out.println("Den gennemsnitlige anciennitet: " + "\n" +
        " " + e.averageSeniority());
        
        System.out.println("Skuespilleren med h�jeste anciennitet: " + "\n" +
        " " + e.mostSeniorActor());
        
        System.out.println("Skuespillere ordnet efter anciennitet og l�n: ");
        e.printActors();
        
    }

}
