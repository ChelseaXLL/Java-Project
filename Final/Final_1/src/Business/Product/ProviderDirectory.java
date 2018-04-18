/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import java.util.ArrayList;

/**
 *
 * @author josef
 */
public class ProviderDirectory {
     private ArrayList<Provider> providerDirectory;
  
    
    public ProviderDirectory(){
        providerDirectory = new ArrayList<>();
    }

    public ArrayList<Provider> getProviderDirectory() {
        return providerDirectory;
    }

    public void setProviderDirectory(ArrayList<Provider> providerDirectory) {
        this.providerDirectory = providerDirectory;
    }
    
    public Provider addProvider(){
        Provider provider = new Provider();
        providerDirectory.add(provider);
        return provider;
    }

    
}
