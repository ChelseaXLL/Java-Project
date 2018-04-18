/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.RequestQueue;
import java.util.ArrayList;
import Business.Product.Product;
import Business.Product.ProductDirectory;

/**
 *
 * @author josef
 */
public abstract class Organization {
    private String name;
    private RequestQueue requestQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private ProductDirectory productDirectory;
    private int organizationID;
    private static int counter;
    private Type type;
    
 public enum Type{
   Admin("Admin Organization"),
   Resident("Resident Organization"),
   Reporting("Reporting Organization"),
   Service("Service Organization"),
   Inventory("Inventory Organization");
   
   private String value;
   private Type(String value){
       this.value=value;
   }
   public String getValue() {
            return value;
   }
 }
 public Organization (String name){
     this.name=name;
     this.type = type;
     employeeDirectory = new EmployeeDirectory();
     userAccountDirectory = new UserAccountDirectory();
     productDirectory=new ProductDirectory();
     requestQueue=new RequestQueue();
     organizationID = counter;
     counter++;
    
     Product pa=productDirectory.addProduct();
     pa.setName("A");
    // pa.setManufacturer("AC");
     pa.setQuantity(0);
    
     Product pb=productDirectory.addProduct();
     pb.setName("B");
     //pb.setManufacturer("BC");
     pb.setQuantity(0);
     
     Product pc=productDirectory.addProduct();
     pc.setName("C");
     //pb.setManufacturer("CC");
     pc.setQuantity(0);
     
     
     Product pd=productDirectory.addProduct();
     pd.setName("D");
    // pb.setManufacturer("DC");
     pd.setQuantity(0);
     
 }
 public abstract ArrayList<Role> getSupportedRole();
     
  public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
            
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public ProductDirectory getProductDirectory() {
        return productDirectory;
    }
    
    public Type getType(){
        return type;
    }
    
    
    public String getName() {
        return name;
    }

    public RequestQueue getRequestQueue() {
        return requestQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(RequestQueue requestQueue) {
        this.requestQueue = requestQueue;
    }
    
    
    @Override
    public String toString() {
        return name;
    }    
 
 
 
 }

    
    
    
    
    


