/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;
import Business.Enterprise.EnterpriseDirectory;
import Business.Product.ProviderDirectory;

/**
 *
 * @author josef
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private ProviderDirectory providerDirectory;
    
    
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
        providerDirectory=new ProviderDirectory();
        
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public ProviderDirectory getProviderDirectory() {
        return providerDirectory;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
    
}
