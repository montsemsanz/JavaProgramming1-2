
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
     * Opret en String repræsentation af objektet. 
     */
    public String toString()
    {
        return "Størrelse: " + size + " kb. " + "Type: " + kind;
    }
    
    /**
     * Returnerer objektets størrelse i kb
     */
    public int getSize()
    {
        return size;
    }
}
