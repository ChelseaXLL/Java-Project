/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ServiceRole;

import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.ServiceDepartment;
import Business.Enterprise.ServiceDepartment;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.ServiceOrganization;
import Business.UserAccount.UserAccount;
import Business.Organization.ReportingOrganization;
import Business.WorkQueue.Rate;
import Business.WorkQueue.ReportingResult;
import Business.WorkQueue.Request;
import Business.WorkQueue.ServiceResult;
import java.awt.CardLayout;
import javax.naming.spi.ResolveResult;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Interface.ResidentRole.ResidentReportJPanel;

/**
 *
 * @author josef
 */
public class ServiceWorkAreaJPanel extends javax.swing.JPanel {
JPanel userProcessContainer;
UserAccount account;
Organization serviceOrganization;
ServiceDepartment enterprise;
Network network;
    /**
     * Creates new form ServiceWorkAreaJPanel
     */
   

    public ServiceWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network) {
      initComponents();
      this.userProcessContainer=userProcessContainer;
      this.account=account;
      this.enterprise=(ServiceDepartment)enterprise;
      this.serviceOrganization=organization;
      this.network=network;
      populateTable(this.enterprise);
      populateFeedback();
     
     
    }
   public void populateFeedback(){
        DefaultTableModel dtm=(DefaultTableModel)feedbackTable.getModel();
        dtm.setRowCount(0);
        for(Rate rate:enterprise.getRateList().getRateList()){
            Object[] row=new Object[2];
            row[0]=rate.getRate();
            row[1]=rate.getResident().getUsername();
            dtm.addRow(row);
        }
        
    }
    public void populateProgress(){
         int selectedRow = requestTable.getSelectedRow();
         
          if(selectedRow<0){
              JOptionPane.showMessageDialog(null,"Please confirm your request!","Warning",JOptionPane.WARNING_MESSAGE);
          }
          else{
               requestTable.setValueAt(txtProgress.getText(), selectedRow, 3);
          }
         
    }
    public void populateTable(Enterprise enterprise){
        DefaultTableModel dtm=(DefaultTableModel)requestTable.getModel();
        dtm.setRowCount(0);
        for(Request request:enterprise.getRequestQueue().getRequestList()){
            Object[] row=new Object[4];
            row[0]=request;
            row[1]=request.getSender().getEmployee().getName();
            row[2]=request.getStatus();
            
           // String resolveResult=((ServiceResult)request).getResolveResult();
           
               
            row[3]=request.getValue();//resolveResult==null?"Recieved":resolveResult;
            // String reportingStatus=((ReportingResult) request).getReportingStatus();
            //row[3]= reportingStatus==null?"Recieved":reportingStatus;
          
        
             dtm.addRow(row);
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        btnProcess = new javax.swing.JButton();
        txtResolve = new javax.swing.JButton();
        btnProgress = new javax.swing.JButton();
        txtProgress = new javax.swing.JTextField();
        ProgressBar = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        feedbackTable = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("微软雅黑", 1, 24)); // NOI18N
        jLabel1.setText("Recieving  Requests");

        requestTable.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Status", "Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(requestTable);
        if (requestTable.getColumnModel().getColumnCount() > 0) {
            requestTable.getColumnModel().getColumn(0).setResizable(false);
            requestTable.getColumnModel().getColumn(1).setResizable(false);
            requestTable.getColumnModel().getColumn(2).setResizable(false);
            requestTable.getColumnModel().getColumn(3).setResizable(false);
        }

        btnProcess.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        txtResolve.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        txtResolve.setText("Reslove ");
        txtResolve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResolveActionPerformed(evt);
            }
        });

        btnProgress.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        btnProgress.setText("Progress");
        btnProgress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProgressActionPerformed(evt);
            }
        });

        ProgressBar.setStringPainted(true);

        feedbackTable.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        feedbackTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rate", "From"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(feedbackTable);
        if (feedbackTable.getColumnModel().getColumnCount() > 0) {
            feedbackTable.getColumnModel().getColumn(0).setResizable(false);
            feedbackTable.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtResolve, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(128, 128, 128)
                                        .addComponent(btnProgress)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtProgress)
                                    .addComponent(ProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProcess))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnProgress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResolve))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
         int selectedRow = requestTable.getSelectedRow();
         Request request = (Request)requestTable.getValueAt(selectedRow, 0);
         request.setStatus("Processing");
         populateTable(enterprise);
      
    }//GEN-LAST:event_btnProcessActionPerformed

    private void txtResolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResolveActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        Request request = (Request)requestTable.getValueAt(selectedRow, 0);
        request.setReceiver(account);
        request.setStatus("Dealing in Progress");
        populateTable(enterprise);
        ServiceProcessArea spa=new ServiceProcessArea(userProcessContainer,request,account,enterprise,network);
        userProcessContainer.add("spa",spa);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_txtResolveActionPerformed

    private void btnProgressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProgressActionPerformed
        // TODO add your handling code here:
        int value = -1;
        try {
            value = Integer.parseInt(txtProgress.getText());
        } catch (Exception e) {
            System.out.println(e);
        }
        
        if (value == -1) return;
        System.out.print(value);
        ProgressBar.setValue(value);
            int selectedRow = requestTable.getSelectedRow();
            Request request = (Request)requestTable.getValueAt(selectedRow, 0);
            request.setValue(value);
        if(value ==100){
            
            request.setStatus("Completed!");
            
        }
       //populateProgress();
       populateTable(enterprise);
         
          
        
    }//GEN-LAST:event_btnProgressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnProgress;
    private javax.swing.JTable feedbackTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable requestTable;
    private javax.swing.JTextField txtProgress;
    private javax.swing.JButton txtResolve;
    // End of variables declaration//GEN-END:variables
}