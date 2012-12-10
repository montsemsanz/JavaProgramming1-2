import java.util.*;

/**
 * Department class. A department in a company with
 * an arbitrary number of employees.
 * 
 * @author Susie 
 * @version den endelige version, 22.09.07
 */
public class Department
{
    // The departments name.
    private String departmentName;
    // The departments employees.
    public ArrayList<Employee> employees; 
    // The Head Of Department.
    private Employee headOfDepartment;
        
    /**
     * Create an object of the class Department
     */
    public Department(String n, Employee h)
    {
        departmentName = n;
        employees = new ArrayList<Employee>();
        headOfDepartment = h;
    }

    /**
     * Add a new employee to the department.
     */
    public void addEmployee (Employee e) {
        employees.add(e);
    }
    
    /**
     * Remove an employee from the department. 
     */
    public void removeEmployee (Employee e) {
        employees.remove(e);
    }  
    
    /**
     * Return the departments total cost of salary for the 
     * employees (including the HOD).
     */
    public int departmentSalary() {
        int salary = 0;
        
        for(Employee e : employees) {
            salary = salary + e.getSalary();
        }
        
        return salary + headOfDepartment.getSalary();
    }
    
    /**
     * Return the best paid employee in the department.
     */
    public Employee bestPaidEmployee() {
        Employee bestSoFar = employees.get(0); 
        for(Employee e : employees) {
            if(e.getSalary() > bestSoFar.getSalary()) {
                bestSoFar = e;
            }
        }
        return bestSoFar;
    }
}
     
   
    
