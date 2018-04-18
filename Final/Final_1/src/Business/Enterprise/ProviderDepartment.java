/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
import Business.Role.Role;
import Business.Enterprise.Enterprise.EnterpriseType;
import java.util.ArrayList;

/**
 *
 * @author josef
 */
public class ProviderDepartment extends Enterprise {
    public ProviderDepartment(String name){
        super(name,EnterpriseType.ProviderDepartment);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
      return null;
    }
    
}
