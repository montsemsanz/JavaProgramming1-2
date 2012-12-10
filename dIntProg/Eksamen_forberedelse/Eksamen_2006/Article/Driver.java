
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
       Article a1 = new Article("Stephensen, Ole", "Nu kan det være nok", 78);
       Article a2 = new Article("Krasnik, Martin", "Tilbage til Europa", 85);
       Article a3 = new Article("Svane, Anne-Mette", "Hvorfor valg nu", 69);
       Article a4 = new Article("Jensen, Ole", "Nu kan det være nok", 85);
       Article a5 = new Article("Andersen, Martin", "Tilbage til Europa", 85);
       Article a6 = new Article("Hansen, Anne-Mette", "Hvorfor valg nu", 85);
       
       System.out.println(a1 + "\n" + a2 + "\n" + a3);
       
       Journal j = new Journal("Weekendavisen");
       j.add(a1);
       j.add(a2);
       j.add(a3);
       j.add(a4);
       j.add(a5);
       j.add(a6);
       
       System.out.println("Artikler af Martin Krasnik:" + "\n" +
       " " + j.selectByAuthor("Krasnik, Martin"));
       
       System.out.println("Artikel med højeste antal points:" + "\n" + 
       " " + j.highScoreArticle());
       
       System.out.println("Artikler ordnet efter points og navn:");
       j.printArticles();
    }

}
