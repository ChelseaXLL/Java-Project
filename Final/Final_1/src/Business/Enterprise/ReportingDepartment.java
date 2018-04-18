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
public class ReportingDepartment extends Enterprise{
    public ReportingDepartment(String name){
        super(name,EnterpriseType.ReportingDepartment);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
