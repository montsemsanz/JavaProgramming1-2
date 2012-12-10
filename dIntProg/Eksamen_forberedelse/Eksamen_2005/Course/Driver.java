
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
        Course c1 = new Course("dIntProg", "2005-06", "Q1", 295);
        Course c2 = new Course("Prog2", "2006-01", "Q1", 203);
        Course c3 = new Course("dIntProg", "2005-06", "Q3", 235);
        Course c4 = new Course("Prog2", "2006-01", "Q3", 321);
        Course c5 = new Course("dIntProg", "2005-06", "Q3", 295);
        Course c6 = new Course("Prog2", "2006-01", "Q3", 203);
        Course c7 = new Course("dIntProg", "2005-06", "Q1", 235);
        Course c8 = new Course("Prog2", "2006-01", "Q1", 321);
        
        
        System.out.println(c1 + "\n" + c2);
        
        StudyProgram sp = new StudyProgram("Datalogi");
        sp.add(c1);
        sp.add(c2);
        sp.add(c3);
        sp.add(c4);
        sp.add(c5);
        sp.add(c6);
        sp.add(c7);
        sp.add(c8);
        
        System.out.println("Bedst besøgte kursus: " + "\n" +
        " " + sp.mostCrowded());
        
        System.out.println("Antal studerende i Q1: " + "\n" + 
        " " + sp.total("Q1"));
        
        System.out.println("Antal studerende i Q3: " + "\n" + 
        " " + sp.total("Q3"));
        
        System.out.println("Liste ordnet efter år, subsidiært quarter: ");
        sp.printCourses();
    }
}