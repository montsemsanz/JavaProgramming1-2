
/**
 * TestDriver class.
 * 
 * @author Susie 
 * @version den endelige version, 22.09.07.
 */

public class Tester
{
    public static void run1() {
        DieCup c1 = new DieCup();
        DieCup c2 = new DieCup();
        
        c1.throwDice();
        System.out.println(c1.getEyes());
        c2.throwDice();
        System.out.println(c2.getEyes());
        System.out.println(c1.getEyes() + c2.getEyes()); 
    } 

    public static void run2() {
        DieCup c1 = new DieCup(3);
        DieCup c2 = new DieCup(4);
        
        c1.throwDice();
        System.out.println(c1.getEyes());
        c2.throwDice();
        System.out.println(c2.getEyes());
        System.out.println(c1.getEyes() + c2.getEyes());
    }
    
   
    public static void run3() {
        DieCup c1 = new DieCup(3);
        DieCup c2 = new DieCup(4);
        
        int index = 0;
        boolean found = false;
        while(c1.getEyes() <= c2.getEyes()) {
            c1.throwDice();
            c2.throwDice();
            index++;
        }
        if(c1.getEyes() > c2.getEyes()) {
            found = true; {
                System.out.println(index);
            }
        }
    }            
    
    public static void run4() {
        DieCup c1 = new DieCup(3);
        DieCup c2 = new DieCup(4);
        
        int valueHigh1 = 0;
        int valueHigh2 = 0;
        int valueEqual = 0;
       
        for(int i = 0; i < 100; i++) {
            c1.throwDice();
            c2.throwDice();
        
            if(c1.getEyes() > c2.getEyes()) {
               valueHigh1 = valueHigh1 + 1;
            }
            if(c1.getEyes() < c2.getEyes()) {
               valueHigh2 = valueHigh2 + 1;
            }
            if(c1.getEyes() == c2.getEyes()) {
               valueEqual = valueEqual + 1;
            }
        }
        System.out.println(" c1 slog højeste antal øjne " + valueHigh1 + 
                           " antal gange ");
        System.out.println(" c2 slog højeste antal øjne " + valueHigh2 +
                           " antal gange ");
        System.out.println(" c1 og c2 slog samme antal øjne " + valueEqual +
                           " antal gange "); 
        }
}
        
     

