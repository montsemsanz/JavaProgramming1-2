
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
        ScoutGroup sg1 = new ScoutGroup("DDS - Valhalla", "Østjylland", 122);
        ScoutGroup sg2 = new ScoutGroup("TDS - Yggdrasil", "Nordsjælland", 176);
        ScoutGroup sg3 = new ScoutGroup("DDS - Valhalla", "Østjylland", 234);
        ScoutGroup sg4 = new ScoutGroup("TDS - Yggdrasil", "Nordsjælland", 325);
        ScoutGroup sg5 = new ScoutGroup("DDS - Valhalla", "Østjylland", 143);
        ScoutGroup sg6 = new ScoutGroup("TDS - Yggdrasil", "Nordsjælland", 254);
        
        System.out.println(sg1 + "\n" + sg2);
        
        ScoutCamp sc = new ScoutCamp("Sommertræf");
        sc.add(sg1);
        sc.add(sg2);
        sc.add(sg3);
        sc.add(sg4);
        sc.add(sg5);
        sc.add(sg6);
        
        System.out.println("Antal spejdergrupper fra Nordsjælland: " + "\n" + 
        sc.noOfScoutGroups("Nordsjælland"));
        
        System.out.println("Alle spejdergrupper fra Østjylland: " + "\n" +
        sc.find("Østjylland"));
        
        System.out.println("Spejdergrupper ordnet efter område og medlemmer: ");
        sc.printScoutGroups();
    }
        
}
