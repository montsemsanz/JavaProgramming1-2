/**
 * The main part of the calculator doing the calculations.
 * 
 * @author  David J. Barnes and Michael Kolling 
 * @version 2006.03.30
 */
public interface CalcEngine
{
    public String getDisplayValue();
    public void numberPressed(int number);
    public void plus();
    public void minus();
    public void equals();
    public void clear();
    public String getTitle();
    public String getAuthor();
    public String getVersion();
    
}
