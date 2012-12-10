
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main(String[] args)
    {
        Whiskey w1 = new Whiskey("Longmorn", 45, 85);
        Whiskey w2 = new Whiskey("Johnny Walker", 63, 90);
        Whiskey w3 = new Whiskey("Irish Meadow", 50, 80);
        
        System.out.println(w1 + "\n" + w2 + "\n" + w3);
        
        Bar b = new Bar("Lounge");
        b.add(w1);
        b.add(w2);
        b.add(w3);
        
        System.out.println("Whiskey with a grade over 70: " + "\n" + 
        b.whiskeyWithGrade(70));
        
        System.out.println("Grade divideret med pris: ");
        System.out.println("Longmorn: " + w1.getRatio());
        System.out.println("Johnny Walker: " + w2.getRatio());
        System.out.println("Irish Meadow: " + w3.getRatio());

        System.out.println("Whiskey ordnet efter value for money: ");
        b.printWhiskey();
        
    }
        
}
