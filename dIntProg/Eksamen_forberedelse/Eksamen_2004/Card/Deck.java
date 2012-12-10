import java.util.*;
/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deck
{
    private List<Card> cards;

    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
        cards = new ArrayList<Card>();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void addCard(Card c)
    {
        cards.add(c);
    }
    
    /**
     * 
     */
    public void removeCard(Card c)
    {
        cards.remove(c);
    }
    
    /**
     * 
     */
    public void listDeck()
    {
        for(Card c : cards) {
            System.out.println(" " + c);
        }    
    }
    
     
    /**
     * 
     */
    public void orderCardsByRank()
    {
        Collections.sort(cards);
        for(Card c : cards) {
            System.out.println(" " + c);
        }
    }
     
}
