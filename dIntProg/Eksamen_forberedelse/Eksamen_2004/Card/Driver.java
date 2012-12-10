
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
        Card c1 = new Card("hearts", 12);
        Card c2 = new Card("diamonds", 10);
        Card c3 = new Card("clubs", 6);
        Card c4 = new Card("spades", 8);
        Card c5 = new Card("hearts", 3);
        Card c6 = new Card("diamonds", 5);
        Card c7 = new Card("spades", 10);
        Card c8 = new Card("clubs", 10);
        Card c9 = new Card("hearts", 10);
        Card c10 = new Card("spades", 5);
        Card c11 = new Card("hearts", 5);
        Card c12 = new Card("clubs", 5);
        
                       
        System.out.println(c1 + "\n" + c2);
        
        Deck d1 = new Deck();
        d1.addCard(c1);
        d1.addCard(c2);
        d1.addCard(c3);
        d1.addCard(c4);
        d1.addCard(c5);
        d1.addCard(c6);
        d1.addCard(c7);
        d1.addCard(c8);
        d1.addCard(c9);
        d1.addCard(c10);
        d1.addCard(c11);
        d1.addCard(c12);
                     
        System.out.println("Liste over samtlige kort: ");
        d1.listDeck();
        
        System.out.println("Kort ordnet efter værdi og kulør: ");
        d1.orderCardsByRank();
    }
}
