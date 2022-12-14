/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karan
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateNetworkComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEnterprise.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount.getUsername();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox(){
        cmbNetwork.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            cmbNetwork.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        cmbEnterprise.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            cmbEnterprise.addItem(enterprise);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterprise = new javax.swing.JTable();
        lblNetwork = new javax.swing.JLabel();
        cmbNetwork = new javax.swing.JComboBox();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblEnterprise = new javax.swing.JLabel();
        cmbEnterprise = new javax.swing.JComboBox();
        btnSubmit = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        separatorLine1 = new javax.swing.JSeparator();
        separatorLine2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1190, 848));
        setPreferredSize(new java.awt.Dimension(1190, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblEnterprise.setBackground(new java.awt.Color(51, 204, 255));
        tblEnterprise.setForeground(new java.awt.Color(36, 47, 65));
        tblEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEnterprise.setGridColor(new java.awt.Color(97, 212, 195));
        jScrollPane1.setViewportView(tblEnterprise);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 560, 170));

        lblNetwork.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblNetwork.setForeground(new java.awt.Color(255, 255, 255));
        lblNetwork.setText("Network:");
        add(lblNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, -1, -1));

        cmbNetwork.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        cmbNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetworkActionPerformed(evt);
            }
        });
        add(cmbNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 136, -1));

        lblUsername.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Username:");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, -1, -1));

        txtUsername.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setBorder(null);
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 170, 20));

        lblEnterprise.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        lblEnterprise.setText("Enterprise:");
        lblEnterprise.setToolTipText("");
        add(lblEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, -1, -1));

        cmbEnterprise.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        cmbEnterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEnterpriseActionPerformed(evt);
            }
        });
        add(cmbEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 136, -1));

        btnSubmit.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 190, -1));

        lblPassword.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, -1, -1));

        txtName.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(null);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 180, 20));

        lblName.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, -1, -1));

        txtPassword.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 180, 20));

        separatorLine1.setForeground(new java.awt.Color(255, 255, 255));
        separatorLine1.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine1.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 180, -1));

        separatorLine2.setForeground(new java.awt.Color(255, 255, 255));
        separatorLine2.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine2.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cmbNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetworkActionPerformed

        Network network = (Network) cmbNetwork.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
        
        
    }//GEN-LAST:event_cmbNetworkActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        Enterprise enterprise = (Enterprise) cmbEnterprise.getSelectedItem();
        System.out.println(enterprise.getNetwork().getName());
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());
        String name = txtName.getText();
        
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
        if(username.equals("") || password.equals("")||name.equals("")){
            JOptionPane.showMessageDialog(null, "Please agree to the terms of service", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(username)){
            JOptionPane.showMessageDialog(null, "Username already exists, select a new username", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new AdminRole());
        populateTable();
        
        dB4OUtil.storeSystem(system);
        txtPassword.setText("");
        txtName.setText("");
        txtUsername.setText("");
      
        
    }//GEN-LAST:event_btnSubmitActionPerformed


    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        try{
            SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        }catch(Exception e){
            System.out.println("Exception caught");
        }
        
        //JTree removed --> sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    private void cmbEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEnterpriseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEnterpriseActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cmbEnterprise;
    private javax.swing.JComboBox cmbNetwork;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JSeparator separatorLine1;
    private javax.swing.JSeparator separatorLine2;
    private javax.swing.JTable tblEnterprise;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
