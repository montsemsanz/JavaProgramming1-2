
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
        Course c2 = new Course("dProg2", "2005-01", "Q4", 321);
        Course c3 = new Course("dIntProg", "2005-06", "Q3", 325);
        Course c4 = new Course("dProg2", "2005-01", "Q2", 287);
        Course c5 = new Course("dIntProg", "2005-06", "Q2", 358);
        Course c6 = new Course("dProg2", "2005-01", "Q3", 278);
        
        System.out.println(c1 + "\n" + c2);
        
        StudyProgram sp = new StudyProgram("Datalogi");
        sp.add(c1);
        sp.add(c2);
        sp.add(c3);
        sp.add(c4);
        sp.add(c5);
        sp.add(c6);
         
        System.out.println("Det mest besatte kursus: " + "\n" +
        sp.mostCrowded());
        
        System.out.println("Det totale antal studerende i Q1: " + "\n" +
        sp.total("Q1"));
        
        System.out.println("Kurser ordnet efter år og kvartal: ");
        sp.printCourses();
        
    }

}
