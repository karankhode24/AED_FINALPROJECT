/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.ManufacturingRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ManufacturingOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.PurchaseInventory;
import Business.Organization.Vaccine;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.requestVaccine;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karan
 */
public class OrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrdersJPanel
     */
    private EcoSystem system;
    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    private ManufacturingOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public OrderJPanel(JPanel userProcessContainer, Enterprise enterprise, OrganizationDirectory directory, ManufacturingOrganization organization, UserAccount userAccount) {
        initComponents();
        this.directory = directory;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        System.out.println(enterprise.getName());
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        lblComment = new javax.swing.JLabel();
        txtComment = new javax.swing.JTextField();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        separatorLine = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(153, 255, 255));
        setMinimumSize(new java.awt.Dimension(1440, 848));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblOrders.setBackground(new java.awt.Color(102, 204, 255));
        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Quantity", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblOrders);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 610, 190));

        lblComment.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblComment.setForeground(new java.awt.Color(255, 255, 255));
        lblComment.setText("Comments:");
        add(lblComment, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        txtComment.setBackground(new java.awt.Color(153, 204, 255));
        txtComment.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtComment.setBorder(null);
        add(txtComment, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 230, -1));

        btnApprove.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 90));

        btnReject.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 100, 90));

        separatorLine.setForeground(new java.awt.Color(255, 255, 255));
        separatorLine.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 220, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        for(Vaccine v : organization.getVaccineDirectory()){
            System.out.println("Inside for");
            if(v.getStatus().equals("Approved")){
                System.out.println("Vaccine record approved");
                int selectedRow = tblOrders.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select an order to approve");
            return;
        }
        requestVaccine request = (requestVaccine)tblOrders.getValueAt(selectedRow, 0);
        
        if(request.getStatus().equals("Approved")){
            JOptionPane.showMessageDialog(this, "Vaccine already approved");
            return;
        }
     
        if(validate(txtComment.getText())){
        request.setStatus("Approved");
        request.setTestResult("Approved");
        ArrayList<PurchaseInventory> inv = ((requestVaccine) request).getInventoryPurchase();
        if(inv!=null){
            for(PurchaseInventory p : inv){
                ((requestVaccine) request).setQty(p.getQty());
                
            }
            }
        
        
        populateTable();
        dB4OUtil.storeSystem(system);
        txtComment.setText("");
        }
        break;
            }
            else{
                JOptionPane.showMessageDialog(this, "You must have an approved vaccine in the inventory to manage orders");
                return;
            }
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrders.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select an order");
            return;
        }
        requestVaccine request = (requestVaccine)tblOrders.getValueAt(selectedRow, 0);
        
        if(request.getStatus().equals("Rejected") || request.getStatus().equals("Approved")){
            JOptionPane.showMessageDialog(this, "Vaccine already processed");
            return;
        }
     
        if(validate(txtComment.getText())){
        request.setStatus("Rejected");
        request.setTestResult("Rejected");
        
        populateTable();
        }
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnReject;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblComment;
    private javax.swing.JSeparator separatorLine;
    private javax.swing.JTable tblOrders;
    private javax.swing.JTextField txtComment;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        model.setRowCount(0);
        System.out.println(enterprise.getName());
        try{
        for(WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()){
            ArrayList<PurchaseInventory> inv = ((requestVaccine) wr).getInventoryPurchase();
            Object[] row = new Object[4];
            row[0] = wr;
            row[1] = wr.getReceiver().getUsername();
            if(inv!=null){
            for(PurchaseInventory p : inv){
                row[2] = p.getQty();
            }
            }
            row[3] = wr.getStatus();
            model.addRow(row);
        }
    }
        catch(NullPointerException e){
            System.out.println("Null exception caught");
    }
    }

    private boolean validate(String comment) {
       if(comment.length()<1){
           JOptionPane.showMessageDialog(this, "Please enter comments");
           return false;
       }
           return true;
    }
    
}
