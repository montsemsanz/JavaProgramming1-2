
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
        Politician p1 = new Politician("Verner Valgflæsk", "Vejrhanerne", 345);
        Politician p2 = new Politician("Anders Anderledes", "Alternativet", 275);
        Politician p3 = new Politician("Vinnie Vendekåbe", "Vejrhanerne", 67);
        Politician p4 = new Politician("Anna Anderledes", "Alternativet", 156);
        Politician p5 = new Politician("Verner Valgflæsk", "Vejrhanerne", 245);
        Politician p6 = new Politician("Verner Valgflæsk", "Vejrhanerne", 145);
        Politician p7 = new Politician("Verner Valgflæsk", "Vejrhanerne", 445);
        
//         System.out.println(p1 + "\n" + p2);
//         
        Parliament pa = new Parliament("Folketinget");
        pa.add(p1);
        pa.add(p2);
        pa.add(p3);
        pa.add(p4);
        pa.add(p5);
        pa.add(p6);
        pa.add(p7);
       
//         System.out.println("Antal politikere, der er medlem af Vejrhanerne:");
//         System.out.println(pa.noOfPoliticians("Vejrhanerne"));
//         
//         System.out.println(pa.find(300));
//         
        pa.printPoliticians();
    }
        
}
