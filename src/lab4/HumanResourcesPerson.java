/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class HumanResourcesPerson {
    private ArrayList<Employee> employees;

    public void hireEmployee(String firstName, String lastName, String ssn, String cubeId){
        Employee newEmployee = new Employee(firstName,lastName,ssn);
        newEmployee.doFirstTimeOrientation(cubeId);
        employees.add(newEmployee);
    }
    
    public void getEmployeeStatuses(){
        for(Employee e : employees){
            e.getReportService().outputReport();
        }
    }
    
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    
    

    
    
}
