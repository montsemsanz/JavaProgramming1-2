
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
        SalesNote s2 = new SalesNote("2004-07-03", "Kuglepenne", 144);
        SalesNote s3 = new SalesNote("2005-10-24", "Stearinlys", 67);
        SalesNote s4 = new SalesNote("2004-07-03", "Servietter", 34);

//         System.out.println(s1 + "\n" + s2);
        
        SalesPerson sa = new SalesPerson("Jens Andersen");
        sa.add(s1);
        sa.add(s2);
        sa.add(s3);
        sa.add(s4);
        
//         System.out.println("Dårligste salg: " + sa.poorestSale());
//         
//         System.out.println("Totale salg: " + sa.totalSales());

        sa.printSales();
        
    }

        
}
