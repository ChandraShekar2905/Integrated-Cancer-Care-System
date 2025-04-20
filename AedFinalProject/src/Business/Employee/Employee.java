/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author aaryakpawar
 */

public class Employee {
    
    private String employeename;
    private int id;
    private static int count = 1;

    public Employee() {

        id = count;
        count++;
    }
 //Implemented Getters and Setters for Employee
    public int getId() {
        return id;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    
    public String getEmployeename() {
        return employeename;
    }
    
    //Overriding to String function
    @Override
    public String toString() {
        return employeename;
    }
    
    
}
