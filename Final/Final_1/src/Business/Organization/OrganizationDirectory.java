/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author josef
 */
public class OrganizationDirectory {
       private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Resident.getValue())){
            organization = new ResidentOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Reporting.getValue())){
            organization = new ReportingOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Organization.Type.Service.getValue())){
            organization=new ServiceOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Organization.Type.Inventory.getValue())){
            organization=new ProviderOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
