import java.util.*;
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card implements Comparable<Card>
{
    private String suit;
    private int rank;

    /**
     * Constructor for objects of class Card
     */
    public Card(String s, int r)
    {
        suit = s;
        rank = r;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public String toString()
    {
        return suit + " " + rank;
    }
    
    /**
     * 
     */
    public int getRank()
    {
        return rank;
    }
    
    /**
     * 
     */
    public String getSuit()
    {
        return suit;
    }
    
    /**
     * 
     */
    public int getSuitAsInt()
    {
        if(suit.equals("spades")) {
            return 4;
        }
        else if(suit.equals("hearts")) {
            return 3;
        }
        else if(suit.equals("clubs")) {
            return 2;
        }
        else {
            return 1;
        }
    }
    
    /**
     * 
     */
    public int compareTo(Card c)
    {
        if(rank != c.getRank()) {
            return rank - c.getRank();
        }
        return getSuitAsInt() - c.getSuitAsInt();
    }
    
}
