
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
        Scout s1 = new Scout("1990-05-17", "Bent Bak", 17); 
        Scout s2 = new Scout("1991-07-22", "Anna Aller", 21); 
        Scout s3 = new Scout("1991-11-14", "Bent Bak", 18); 
        Scout s4 = new Scout("1991-10-13", "Anna Aller", 19); 
        Scout s5 = new Scout("1990-02-03", "Bent Bak", 20); 
        Scout s6 = new Scout("1991-03-25", "Anna Aller", 22); 
        Scout s7 = new Scout("1990-08-17", "Bent Bak", 17); 
        Scout s8 = new Scout("1991-06-23", "Anna Aller", 21); 
        Scout s9 = new Scout("1991-12-12", "Bent Bak", 18); 
        Scout s10 = new Scout("1991-09-13", "Anna Aller", 19); 
        Scout s11 = new Scout("1990-01-03", "Bent Bak", 20); 
        Scout s12 = new Scout("1991-03-26", "Anna Aller", 22); 
        Scout s13 = new Scout("1990-04-17", "Bent Bak", 17); 
        Scout s14 = new Scout("1991-09-22", "Anna Aller", 21); 
        Scout s15 = new Scout("1991-10-14", "Bent Bak", 18); 
        Scout s16 = new Scout("1991-02-13", "Anna Aller", 19); 
        Scout s17 = new Scout("1990-04-03", "Bent Bak", 20); 
        Scout s18 = new Scout("1991-03-27", "Anna Aller", 22); 
        
        System.out.println(s1 + "\n" + s2);
        
        ScoutGroup sg = new ScoutGroup();
        sg.add(s1);
        sg.add(s2);
        sg.add(s3);
        sg.add(s4);
        sg.add(s5);
        sg.add(s6);
        sg.add(s7);
        sg.add(s8);
        sg.add(s9);
        sg.add(s10);
        sg.add(s11);
        sg.add(s12);
        sg.add(s13);
        sg.add(s14);
        sg.add(s15);
        sg.add(s16);
        sg.add(s17);
        sg.add(s18);
        
        
        System.out.println("Spejdergruppens total antal mærker: " + "\n" +
        sg.totalMarks());
        
        System.out.println("Spejdere med 20 mærker eller derover: " + "\n" +
        sg.find(20));
        
        System.out.println("Spejdere sorteret efter mærker og fødselsdato: ");
        sg.printScouts();
    }

}
