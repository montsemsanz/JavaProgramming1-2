
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
       Beer b1 = new Beer("Carls Special", 33, 25);
       Beer b2 = new Beer("Påskebryggen", 65, 24);
       Beer b3 = new Beer("Juleøllen", 37, 27);
       Beer b4 = new Beer("Discountbajeren", 50, 20);
       
       System.out.println(b1 + "\n" + b2 + "\n" + b3 + "\n" + b4);
       
       Pub p = new Pub("Peder Gift");
       p.add(b1);
       p.add(b2);
       p.add(b3);
       p.add(b4);
       
       System.out.println("Volumen ml. 25 og 35: " + p.beerWithVolume(25, 35));
       System.out.println("Volumen ml. 36 og 50: " + p.beerWithVolume(36, 50));
       System.out.println("Volumen ml. 51 og 100: " + p.beerWithVolume(51, 100));

       System.out.println("Ratio: Hvor meget øl får man for pengene:");
       System.out.println("Carls Special: " + b1.getRatio());
       System.out.println("Påskebryggen: " + b2.getRatio()); 
       System.out.println("Juleøllen: " + b3.getRatio());
       System.out.println("Discountbajeren: " + b4.getRatio());
       
       System.out.println("Liste over øl ordnet efter, hvor meget øl for pengene:");      
       p.printBeers();
       
       System.out.println("Bedste køb: " + "\n" + p.bestBuy());
       
     
       

   }
}
