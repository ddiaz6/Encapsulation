/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author HP
 */
public class Organization {
    private HumanResourcesPerson humanResourcesPerson;

    public Organization() {
        this.humanResourcesPerson = new HumanResourcesPerson();
    }
      
    public void hireEmployee(String firstName, String lastName, String ssn, String cubeId){
        humanResourcesPerson.hireEmployee(firstName, lastName, ssn, cubeId);
        humanResourcesPerson.getStatusOfEmployee(ssn);
    }
        
    public HumanResourcesPerson getHumanResourcesPerson() {
        return humanResourcesPerson;
    }

    public void setHumanResourcesPerson(HumanResourcesPerson humanResourcesPerson) {
        this.humanResourcesPerson = humanResourcesPerson;
    }
    
    
        
    
    
}
