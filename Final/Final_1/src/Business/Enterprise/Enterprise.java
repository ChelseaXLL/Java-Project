/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.WorkQueue.RateList;
/**
 *
 * @author josef
 */
public abstract class Enterprise extends Organization {
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private RateList rateList;
    
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        rateList=new RateList();
        
    }
    
    public enum EnterpriseType{
        Committee("Committee"),
        ProviderDepartment("ProviderDepartment"),
        ReportingDepartment("ReportingDepartment"),
        ServiceDepartment("ServiceDepartment");
        
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public RateList getRateList() {
        return rateList;
    }

    public void setRateList(RateList rateList) {
        this.rateList = rateList;
    }
    
    

    
}
/*
 public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        
    }
    
    public enum EnterpriseType{
        Distributor("Distributor"),
        CDC("CDC"),
        StateLevelProvider("State Level Provider");
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    @Override
        public String toString() {
            return name;
        }
    
*/
