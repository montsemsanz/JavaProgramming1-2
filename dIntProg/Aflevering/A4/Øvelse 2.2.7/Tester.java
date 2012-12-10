
/**
 * Write a description of class Tester here.
 * 
 * @author Susie 
 * @version 20.09.07.
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
}