
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
        Player p1 = new Player("Ronaldino", 185, 10);
        Player p2 = new Player("Beckham", 150, 8);
        Player p3 = new Player("Laudrup", 170, 9);
        Player p4 = new Player("Grønkjær", 49, 4);
        Player p5 = new Player("Agger", 70, 5);
        Player p6 = new Player("Kahlenberg", 39, 3);
    
        System.out.println(p1 + "\n" + p2 + "\n" + p3);
        
        Team t = new Team("Verdensholdet");
        t.add(p1);
        t.add(p2);
        t.add(p3);
        t.add(p4);
        t.add(p5);
        t.add(p6);
        
        System.out.println("Spillerens grade divideret med price: ");
        System.out.println("Ronaldino: " + p1.getInvestment());
        System.out.println("Beckham: " + p2.getInvestment());
        System.out.println("Laudrup: " + p3.getInvestment());
        System.out.println("Grønkjær: " + p4.getInvestment());
        System.out.println("Agger: " + p5.getInvestment());
        System.out.println("Kahlenberg: " + p6.getInvestment());
        
        
        System.out.println("Spillere, der koster over 50 mill.:" + "\n" + 
        " " + t.selectByPrice(50));
        
        System.out.println("Spilleren, der er den bedste investering: " + "\n" +
        " " + t.bestInvestment());
        
        System.out.println("Spillere, ordnet efter investering: ");
        t.printPlayers();
        
    }
    

}
