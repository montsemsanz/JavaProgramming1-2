
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
        Politician p2 = new Politician("Anders Anderledes", "Alternativet", 273);
        Politician p3 = new Politician("Vinnie Vendekåbe", "Vejrhanerne", 156);
        Politician p4 = new Politician("Anna Alternativ", "Alternativet", 266);
        Politician p5 = new Politician("Viola Velovervejet", "Vejrhanerne", 411);
        Politician p6 = new Politician("Allan Arrogance", "Alternativet", 143);
        Politician p7 = new Politician("Verner Valgflæsk", "Vejrhanerne", 235);
        Politician p8 = new Politician("Anders Anderledes", "Alternativet", 543);
        Politician p9 = new Politician("Vinnie Vendekåbe", "Vejrhanerne", 267);
        Politician p10 = new Politician("Anna Alternativ", "Alternativet", 395);
        Politician p11 = new Politician("Viola Velovervejet", "Vejrhanerne", 294);
        Politician p12 = new Politician("Allan Arrogance", "Alternativet", 284);
        Politician p13 = new Politician("Verner Valgflæsk", "Vejrhanerne",184);
        Politician p14 = new Politician("Anders Anderledes", "Alternativet", 294);
        Politician p15 = new Politician("Vinnie Vendekåbe", "Vejrhanerne", 591);
        Politician p16 = new Politician("Anna Alternativ", "Alternativet", 350);
        Politician p17 = new Politician("Viola Velovervejet", "Vejrhanerne", 207);
        Politician p18 = new Politician("Allan Arrogance", "Alternativet", 188);
        
        System.out.println(p1 + "\n" + p2);
        
        Parliament pa = new Parliament("Folketinget");
        pa.add(p1);
        pa.add(p2);
        pa.add(p3);
        pa.add(p4);
        pa.add(p5);
        pa.add(p6);
        pa.add(p7);
        pa.add(p8);
        pa.add(p9);
        pa.add(p10);
        pa.add(p11);
        pa.add(p12);
        pa.add(p13);
        pa.add(p14);
        pa.add(p15);
        pa.add(p16);
        pa.add(p17);
        pa.add(p18);
        
        System.out.println("Antal politikere fra Alternativet: " + "\n" + 
        pa.noOfPoliticians("Alternativet"));
        
        System.out.println("Politikere med mere end 300 stemmer: " + "\n" +
        pa.find(300));
        
        System.out.println("Politikere ordnet efter parti, navn og stemmer: ");
        pa.printPoliticians();
        
    }
        
}
