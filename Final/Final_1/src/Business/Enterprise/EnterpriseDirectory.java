/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;


/**
 *
 * @author josef
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<>();
    }
    public ArrayList<Enterprise> getEnterpriseList(){
        return enterpriseList;
    }
    
    public Enterprise createEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Committee){
            enterprise=new Committee(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.ProviderDepartment){
            enterprise=new ProviderDepartment(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.ReportingDepartment){
            enterprise=new ReportingDepartment(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.ServiceDepartment){
            enterprise=new ServiceDepartment(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
}
