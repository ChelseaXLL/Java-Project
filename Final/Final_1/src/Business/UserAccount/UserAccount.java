/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;
import Business.Role.Role;
import Business.Employee.Employee;
import Business.WorkQueue.RequestQueue;

/**
 *
 * @author josef
 */
public class UserAccount {
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private RequestQueue requestQueue;
    private String path;
    
    
    public UserAccount(){
        requestQueue=new RequestQueue();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public RequestQueue getRequestQueue() {
        return requestQueue;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    

    
    
    @Override
    public String toString() {
        return username;
    }
}

