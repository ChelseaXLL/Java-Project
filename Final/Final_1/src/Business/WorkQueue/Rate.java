/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.UserAccount.UserAccount;

/**
 *
 * @author josef
 */
public class Rate {
    private String rate;
    private UserAccount resident;
    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public UserAccount getResident() {
        return resident;
    }

    public void setResident(UserAccount resident) {
        this.resident = resident;
    }

    
    
    
}
