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
import Business.Organization.ResidentOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Interface.ResidentRole.ResidentWorkArea;

/**
 *
 * @author josef
 */
public class ResidentRole extends  Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new ResidentWorkArea (userProcessContainer,account,(ResidentOrganization)organization,enterprise,network);
    }
    //userProcessContainer, enterprise, organization, network
     @Override
    public String toString(){
        return "Resident";
    }
}
