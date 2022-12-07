/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DoctorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.prescribeMedicine;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author karan
 */
public class AddPrescriptionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPrescriptionJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem system;
    private DoctorOrganization organization;
    private Enterprise enterprise;
    private UserAccount person;//userProcessContainer, enterprise, organization, system
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public AddPrescriptionJPanel(JPanel userProcessContainer, Enterprise enterprise, DoctorOrganization organization, EcoSystem system, UserAccount account, UserAccount person) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.enterprise = enterprise;
        this.organization = organization;
        this.person = person;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMedList = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaMedList = new javax.swing.JTextArea();
        btnSubmit = new javax.swing.JButton();
        iconBack = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 47, 65));
        setMinimumSize(new java.awt.Dimension(1440, 848));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMedList.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblMedList.setForeground(new java.awt.Color(255, 255, 255));
        lblMedList.setText("Medicine List:");
        add(lblMedList, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        txtareaMedList.setBackground(new java.awt.Color(36, 47, 65));
        txtareaMedList.setColumns(20);
        txtareaMedList.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtareaMedList.setForeground(new java.awt.Color(255, 255, 255));
        txtareaMedList.setRows(5);
        txtareaMedList.setBorder(null);
        jScrollPane1.setViewportView(txtareaMedList);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        btnSubmit.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 222, -1, -1));

        iconBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        iconBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconBackMousePressed(evt);
            }
        });
        add(iconBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 30, -1, -1));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DOCTORWORKAREA.png"))); // NOI18N
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 100, 850));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(txtareaMedList.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please agree to the terms of service", "Warning", JOptionPane.WARNING_MESSAGE);
            
        }
        
        if(validate(txtareaMedList.getText())){
            UserAccount pharma = new UserAccount();
            prescribeMedicine pm = new prescribeMedicine();
            pm.setPerson(person);
            pm.setSender(account);
            Network cn = enterprise.getNetwork();
            System.out.println("Outside for");
            for(Enterprise e : cn.getEnterpriseDirectory().getEnterpriseList()){
                System.out.println("inside for");
                if(e.getEnterpriseType() == EnterpriseType.Hospital){
                    System.out.println("inside enterprise");
                    for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
                        System.out.println("inside for org");
                        for(UserAccount u : o.getUserAccountDirectory().getUserAccountList()){
                            System.out.println("inside for user");
                            if(u.getRole().toString().equals("Business.Role.PharmaRole")){
                                System.out.println("user found");
                                pm.setReceiver(u);
                                System.out.println(u.getUsername());
                                pharma = u;
                                break;
                            }
                        }
                    }
                }
            }
            pm.setMessage(person.getUsername());
            pm.setMedList(txtareaMedList.getText());
            pm.setStatus("Request");
            person.getWorkQueue().getWorkRequestList().add(pm);
            account.getWorkQueue().getWorkRequestList().add(pm);
            pharma.getWorkQueue().getWorkRequestList().add(pm);
        }
        dB4OUtil.storeSystem(system);
        txtareaMedList.setText("");
         JOptionPane.showMessageDialog(null, "Request Submited");
           
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void iconBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconBackMousePressed
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        DoctorWorkAreaJPanel doctorWorkAreaJPanel = new DoctorWorkAreaJPanel(userProcessContainer, account, organization, enterprise, system);
        userProcessContainer.add("DoctorWorkAreaJPanel", doctorWorkAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_iconBackMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel iconBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMedList;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtareaMedList;
    // End of variables declaration//GEN-END:variables

    private boolean validate(String text) {
        return true;
    }
}
