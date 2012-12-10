
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
        SalesNote s1 = new SalesNote("2005-10-24", "A4-blokke", 237);
        SalesNote s2 = new SalesNote("2003-04-15", "Kuglepenne", 167);
        SalesNote s3 = new SalesNote("2005-10-24", "Viskelæder", 45);
        SalesNote s4 = new SalesNote("2003-04-15", "Notesblokke", 248);
        SalesNote s5 = new SalesNote("2005-10-24", "Viskelæder", 192);
        SalesNote s6 = new SalesNote("2003-04-15", "Notesblokke", 134);
        
        System.out.println(s1 + "\n" + s2);
        
        SalesPerson sp = new SalesPerson("Jens Andersen");
        sp.add(s1);
        sp.add(s2);
        sp.add(s3);
        sp.add(s4);
        sp.add(s5);
        sp.add(s6);
        
        System.out.println("Det dårligste salg: " + "\n" +
        sp.poorestSale());
        
        System.out.println("Det totale salg: " + "\n" + 
        sp.totalSales() + " kr.");
        
        System.out.println("Salesnotes ordnet efter dato og værdi: ");
        sp.printSales();
    }
        
}
