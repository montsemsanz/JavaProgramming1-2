
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
       Customer c1 = new Customer("Jens Andersen", "�rhus", 270);
       Customer c2 = new Customer("Hans Larsen", "K�benhavn", 530);
       Customer c3 = new Customer("Lise M�ller", "�rhus", 345);
       Customer c4 = new Customer("Klaus Jensen", "K�benhavn", 130);
       Customer c5 = new Customer("Ulla Olesen", "�rhus", 432);
       Customer c6 = new Customer("Brian Hansen", "K�benhavn", 242);
       Customer c7 = new Customer("Jens Andersen", "�rhus", 456);
       Customer c8 = new Customer("Hans Larsen", "K�benhavn", 324);
       Customer c9 = new Customer("Lise M�ller", "�rhus", 654);
       Customer c10 = new Customer("Klaus Jensen", "K�benhavn", 354);
       Customer c11= new Customer("Ulla Olesen", "�rhus", 652);
       Customer c12 = new Customer("Brian Hansen", "K�benhavn", 254);
       Customer c13 = new Customer("Jens Andersen", "�rhus", 287);
       Customer c14 = new Customer("Hans Larsen", "K�benhavn", 425);
       Customer c15 = new Customer("Lise M�ller", "�rhus", 275);
       Customer c16 = new Customer("Klaus Jensen", "K�benhavn", 387);
       Customer c17 = new Customer("Ulla Olesen", "�rhus", 276);
       Customer c18 = new Customer("Brian Hansen", "K�benhavn", 287);
       
       System.out.println(c1 + "\n" + c2);
       
       Company co = new Company("IKEA");
       co.add(c1);
       co.add(c2);
       co.add(c3);
       co.add(c4);
       co.add(c5);
       co.add(c6);
       co.add(c7);
       co.add(c8);
       co.add(c9);
       co.add(c10);
       co.add(c11);
       co.add(c12);
       co.add(c13);
       co.add(c14);
       co.add(c15);
       co.add(c16);
       co.add(c17);
       co.add(c18);
       
       System.out.println("Antal kunder i �rhus: " + "\n" + 
       co.noOfCustomers("�rhus"));
       
       System.out.println("Kunder med k�b p� mindst 500: " + "\n" +
       co.find(500));
       
       System.out.println("Kunder ordnet efter by, navn og bel�b: ");
       co.printCustomers();
    }

}
