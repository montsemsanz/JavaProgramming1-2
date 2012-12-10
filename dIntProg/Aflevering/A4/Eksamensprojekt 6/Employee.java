
/**
 * Write a description of class Employee here.
 * 
 * Afleveringsopgave, A4 - 2.
 * @author Susie 
 * @version 20.09.97
 */
public class Employee
{
    // Employees name.
    private String name;
    // Employees salary.
    private int salary;

    /**
     * Create a new employee with a name and a salary.
     */
    public Employee(String n, int s) {
        name = n;
        salary = s;
    }

    /**
     * Get the employee's salary. 
     */
    public int getSalary() {
        return salary;
    }
    
    /**
     * Give a presentation of employee's name and salary.
     */
    public String toString() {
        return name + ", kr. " + salary;
     }   
}
