/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;
import Business.EcoSystem;
import Interface.ReportingRole.ReportingWorkAreaJPanel;
import javax.swing.JPanel;
import Business.UserAccount.UserAccount;
import Business.Organization.Organization;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ReportingOrganization;
import Interface.ReportingRole.ReportingWorkAreaJPanel;

/**
 *
 * @author josef
 */
public class ReportingRole extends Role {
 

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
       return new ReportingWorkAreaJPanel(userProcessContainer,account,(ReportingOrganization)organization,enterprise,business,network);
    }
     @Override
    public String toString(){
        return "ReportingRole";
    }
    
}
