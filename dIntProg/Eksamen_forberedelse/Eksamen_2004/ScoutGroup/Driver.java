
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
       ScoutGroup s1 = new ScoutGroup("DDS - Valhalla", "�stjylland", 112);
       ScoutGroup s2 = new ScoutGroup("DGS - Ygdrasil", "Nordsj�lland", 244);
       ScoutGroup s3 = new ScoutGroup("HST - �bletr�et", "�stjylland", 112);
       ScoutGroup s4 = new ScoutGroup("JBV - Romerne", "Nordsj�lland", 244);
       
       System.out.println(s1 + "\n" + s2);
       
       ScoutCamp c1 = new ScoutCamp("Sommertr�f");
       c1.add(s1);
       c1.add(s2);
       c1.add(s3);
       c1.add(s4);
       
       System.out.println(c1.noOfScoutGroups("�stjylland"));
       
       System.out.println(c1.find("Nordsj�lland"));
       
       c1.printScoutGroups();
   }
       
}
