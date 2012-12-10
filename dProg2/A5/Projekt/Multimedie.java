
/**
 * Write a description of class Multimedie here.
 * 
 * @author Susie 
 * @version 02.12.07
 */
public class Multimedie
{
    private int size;
    private String kind;

    /**
     * Opret et objekt af klassen Multimedie
     */
    public Multimedie(int s, String k)
    {
        size = s;
        kind = k;
    }

    /**
     * Opret en String repr�sentation af objektet. 
     */
    public String toString()
    {
        return "St�rrelse: " + size + " kb. " + "Type: " + kind;
    }
    
    /**
     * Returnerer objektets st�rrelse i kb
     */
    public int getSize()
    {
        return size;
    }
}
