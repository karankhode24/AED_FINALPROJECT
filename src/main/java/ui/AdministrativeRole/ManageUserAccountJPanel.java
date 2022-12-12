/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karan
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel container;
    private Enterprise enterprise;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSystem system;

    public ManageUserAccountJPanel(JPanel container, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;

        popOrganizationComboBox();
       // employeeJComboBox.removeAllItems();
        popData();
    }

    public void popOrganizationComboBox() {
        cmbOrganization.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            cmbOrganization.addItem(organization);
        }
    }
    
    public void populateEmployeeComboBox(Organization organization){
        cmbEmployee.removeAllItems();
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            cmbEmployee.addItem(employee);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        cmbRole.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            cmbRole.addItem(role);
        }
    }

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) tblUser.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) tblUser.getModel()).addRow(row);
            }
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

        btnCreate = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblEmployee = new javax.swing.JLabel();
        cmbEmployee = new javax.swing.JComboBox();
        lblOrganization = new javax.swing.JLabel();
        cmbOrganization = new javax.swing.JComboBox();
        lblRole = new javax.swing.JLabel();
        cmbRole = new javax.swing.JComboBox();
        separatorLine1 = new javax.swing.JSeparator();
        separatorLine2 = new javax.swing.JSeparator();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1190, 848));
        setPreferredSize(new java.awt.Dimension(1190, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreate.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, 60));

        txtUsername.setBackground(new java.awt.Color(36, 47, 65));
        txtUsername.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setBorder(null);
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 230, -1));

        lblUsername.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Username:");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        tblUser.setBackground(new java.awt.Color(97, 212, 195));
        tblUser.setForeground(new java.awt.Color(36, 47, 65));
        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUser.setGridColor(new java.awt.Color(97, 212, 195));
        jScrollPane1.setViewportView(tblUser);
        if (tblUser.getColumnModel().getColumnCount() > 0) {
            tblUser.getColumnModel().getColumn(0).setResizable(false);
            tblUser.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 375, 179));

        lblPassword.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        txtPassword.setBackground(new java.awt.Color(36, 47, 65));
        txtPassword.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 220, -1));

        lblEmployee.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblEmployee.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployee.setText("Employee:");
        add(lblEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        cmbEmployee.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        cmbEmployee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 300, -1));

        lblOrganization.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblOrganization.setForeground(new java.awt.Color(255, 255, 255));
        lblOrganization.setText("Organization:");
        add(lblOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        cmbOrganization.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        cmbOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrganizationActionPerformed(evt);
            }
        });
        add(cmbOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 300, -1));

        lblRole.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblRole.setForeground(new java.awt.Color(255, 255, 255));
        lblRole.setText("Role:");
        add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 40, -1));

        cmbRole.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        cmbRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRoleActionPerformed(evt);
            }
        });
        add(cmbRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 300, -1));

        separatorLine1.setForeground(new java.awt.Color(255, 255, 255));
        separatorLine1.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine1.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 220, 10));

        separatorLine2.setForeground(new java.awt.Color(255, 255, 255));
        separatorLine2.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine2.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 220, 10));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/USERACCOUNTS.png"))); // NOI18N
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 100, 850));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        String userName = txtUsername.getText();
        String password = txtPassword.getText();
        Organization organization = (Organization) cmbOrganization.getSelectedItem();
        Employee employee = (Employee) cmbEmployee.getSelectedItem();
        Role role = (Role) cmbRole.getSelectedItem();
        
        if(userName.equals("") || password.equals("")){
            JOptionPane.showMessageDialog(null, "Please agree to the terms of service", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            JOptionPane.showMessageDialog(null, "Username already exists, select a new username", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
        dB4OUtil.storeSystem(system);
        txtUsername.setText("");
        txtPassword.setText("");
        popData();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void cmbOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrganizationActionPerformed
        Organization organization = (Organization) cmbOrganization.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_cmbOrganizationActionPerformed

    private void cmbRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRoleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox cmbEmployee;
    private javax.swing.JComboBox cmbOrganization;
    private javax.swing.JComboBox cmbRole;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JSeparator separatorLine1;
    private javax.swing.JSeparator separatorLine2;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
