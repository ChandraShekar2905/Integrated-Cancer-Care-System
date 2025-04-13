/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author aaryakpawar, chandrashekarreddykusukunthla
 */

// Created Directory for Employees
public class EmployeeDirectory {

    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee createEmployee(String name) {
        Employee emp = new Employee();
        emp.setEmployeename(name);
        employeeList.add(emp);
        return emp;
    }
}