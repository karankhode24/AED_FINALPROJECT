/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.lang.model.SourceVersion;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karan
 */
public class ManageNetworkPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    /**
     *
     * Creates new form ManageNetworkJPanel
     */
    public ManageNetworkPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateNetworkTable();
    }

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) tblNetwork.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            Object[] row = new Object[1];
            row[0] = network.getName();
            model.addRow(row);
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
        tblNetwork = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        separatorLine = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1190, 848));
        setPreferredSize(new java.awt.Dimension(1190, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblNetwork.setBackground(new java.awt.Color(102, 204, 255));
        tblNetwork.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        tblNetwork.setForeground(new java.awt.Color(36, 47, 65));
        tblNetwork.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNetwork.setGridColor(new java.awt.Color(97, 212, 195));
        jScrollPane1.setViewportView(tblNetwork);
        if (tblNetwork.getColumnModel().getColumnCount() > 0) {
            tblNetwork.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 430, 310));

        lblName.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));

        btnSubmit.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 250, -1));

        txtName.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(null);
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 250, 20));

        separatorLine.setForeground(new java.awt.Color(255, 255, 255));
        separatorLine.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 180, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/admin.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 580, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        String name = txtName.getText();
        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Please input all fields", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Network network = system.createAndAddNetwork();
        network.setName(name);
        //stores in the database
        dB4OUtil.storeSystem(system);
        populateNetworkTable();
        txtName.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JSeparator separatorLine;
    private javax.swing.JTable tblNetwork;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    
}
