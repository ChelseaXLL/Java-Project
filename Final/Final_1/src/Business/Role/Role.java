/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
  public enum RoleType{
      Admin("Admin"),
      Resident("Resident"),
      Reporting("Reporting Role"),
      Service("Service Role"),
      Provider("Provider Role");
      
       private String value;
       private RoleType(String value){
       this.value=value;
   }
       public String getValue(){
           return value;
       }
      
  }
       public abstract JPanel createWorkArea(
            JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization,
            Enterprise enterprise,
            EcoSystem business,
            Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
    
}
