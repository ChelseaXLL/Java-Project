/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ResidentRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author josef
 */
public class ResidentOrganization extends Organization{
    public ResidentOrganization(){
        super(Type.Resident.getValue());
    }
     @Override  
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles=new ArrayList<>();
        roles.add(new ResidentRole());
        return roles;
    }
    
}
