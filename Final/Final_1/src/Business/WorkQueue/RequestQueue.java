/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author josef
 */
public class RequestQueue {
    private ArrayList<Request> requestList;
    
    public RequestQueue(){
        requestList=new ArrayList<>();
    }

    public ArrayList<Request> getRequestList() {
        return requestList;
    }
    
     public void deleteRequest(Request r){
        requestList.remove(r);
    }
    
}
