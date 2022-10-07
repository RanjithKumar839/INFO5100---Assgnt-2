/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ranji
 */
public class EmployeeHistory {
    
    private ArrayList<EmployeeDetails> history;
    
    public EmployeeHistory(){
        this.history = new ArrayList<EmployeeDetails>();
    }

    public ArrayList<EmployeeDetails> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<EmployeeDetails> history) {
        this.history = history;
    }
    
    public EmployeeDetails addNewEmployee(){
        EmployeeDetails newemployee = new EmployeeDetails();
        history.add(newemployee);
        return newemployee;
    }
    
    
    public void deletedetails(EmployeeDetails ed){
        history.remove(ed);
    }
    
    
}
