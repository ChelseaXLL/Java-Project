/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ReportingRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author josef
 */
public class ReportingOrganization extends Organization {
    public ReportingOrganization(){
        super(Type.Reporting.getValue());
    }
  @Override  
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles=new ArrayList<>();
        roles.add(new ReportingRole());
        return roles;
    }
}
