
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
        Shop s1 = new Shop("Bik-Bok", 7, 25000);
        Shop s2 = new Shop("Body Shop", 12, 18000);
        Shop s3 = new Shop("Matas", 14, 32000);
        
        System.out.println(s1 + "\n" + s2 + "\n" + s3);
        
        ShoppingMall sm = new ShoppingMall("StorCenter Nord");
        sm.add(s1);
        sm.add(s2);
        sm.add(s3);
        
        System.out.println("Butikken med den bedste oms�tning: " + "\n" + 
        " " +sm.bestTurnover());
        
        System.out.println("Den totale oms�tning i centeret: " + "\n" +  
        " " + sm.totalTurnover() + " tusind kr./�r");
        
        System.out.println("Liste ordnet efter oms�tning: " );
        sm.printShops();
    }
}
