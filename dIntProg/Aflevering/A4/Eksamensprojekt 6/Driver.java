
/**
 * Driver.
 * 
 * @author Susie 
 * @version 20.09.07
 */
public class Driver
{
    public static void exam() {
        Employee e1 = new Employee("Per Hansen", 3000);
        Employee e2 = new Employee("Lone Andersen", 2000);
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        
        Department d1 = new Department("Economy", e2);
        d1.employees.add(e1);
        
        System.out.println(d1.departmentSalary());
        
            
   }
}
