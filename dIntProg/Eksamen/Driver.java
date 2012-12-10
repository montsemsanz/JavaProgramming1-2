
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
        Game g1 = new Game("New England Patriots", "Washington Redskins", 52, 7);
        Game g2 = new Game("Miami Dolphins", "Washington Redskins", 53, 18);
        Game g3 = new Game("New England Patriots", "Miami Dolphins", 23, 45);
        
        System.out.println(g1 + "\n" + g2 + "\n" + g3);
        
        Tournament t = new Tournament("National Football League");
        t.add(g1);
        t.add(g2);
        t.add(g3);
                   
        System.out.println("Den mest underholdende kamp: " + "\n" +
        t.mostEntertaining());
        
        System.out.println("Kampe ordnet efter underholdningsværdien" + "\n" +
        "og sekundært hjemmeholdets score: ");
        t.printGames();
    }
        
}
