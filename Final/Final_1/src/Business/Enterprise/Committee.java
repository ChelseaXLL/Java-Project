/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author josef
 */
public class Committee extends Enterprise{
    public Committee(String name){
        super(name,EnterpriseType.Committee);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       return null;
    }
    
}
