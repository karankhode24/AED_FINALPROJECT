

package ui;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import ui.AdministrativeRole.ManageEmployeeJPanel;
import ui.AdministrativeRole.ManageOrganizationJPanel;
import ui.AdministrativeRole.ManageUserAccountJPanel;

/**
 *
 * @author  karan
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount account;
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise,UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        lblValue.setText(enterprise.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        lblValue = new javax.swing.JLabel();
        onePanel = new javax.swing.JPanel();
        lblOrganizations = new javax.swing.JLabel();
        iconOrganizations = new javax.swing.JLabel();
        twoPanel = new javax.swing.JPanel();
        lblEmployees = new javax.swing.JLabel();
        iconEmployees = new javax.swing.JLabel();
        threePanel = new javax.swing.JPanel();
        lblUsers = new javax.swing.JLabel();
        iconUsers = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        cardWorkPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 47, 65));
        setMinimumSize(new java.awt.Dimension(1440, 848));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPanel.setBackground(new java.awt.Color(36, 47, 65));
        menuPanel.setMaximumSize(new java.awt.Dimension(250, 848));
        menuPanel.setMinimumSize(new java.awt.Dimension(250, 848));
        menuPanel.setPreferredSize(new java.awt.Dimension(250, 848));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblValue.setFont(new java.awt.Font("Optima", 1, 22)); // NOI18N
        lblValue.setForeground(new java.awt.Color(97, 212, 195));
        lblValue.setText("<value>");
        menuPanel.add(lblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 230, 30));

        onePanel.setBackground(new java.awt.Color(36, 47, 65));
        onePanel.setMaximumSize(new java.awt.Dimension(250, 40));
        onePanel.setMinimumSize(new java.awt.Dimension(250, 40));
        onePanel.setPreferredSize(new java.awt.Dimension(250, 40));
        onePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onePanelMouseClicked(evt);
            }
        });
        onePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrganizations.setFont(new java.awt.Font("Optima", 1, 16)); // NOI18N
        lblOrganizations.setForeground(new java.awt.Color(255, 255, 255));
        lblOrganizations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrganizations.setText("MANAGE ORGANIZATION");
        lblOrganizations.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblOrganizations.setMaximumSize(new java.awt.Dimension(180, 20));
        lblOrganizations.setMinimumSize(new java.awt.Dimension(180, 20));
        lblOrganizations.setPreferredSize(new java.awt.Dimension(180, 20));
        onePanel.add(lblOrganizations, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 207, -1));

        iconOrganizations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manageorganization.png"))); // NOI18N
        onePanel.add(iconOrganizations, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        menuPanel.add(onePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        twoPanel.setBackground(new java.awt.Color(36, 47, 65));
        twoPanel.setMaximumSize(new java.awt.Dimension(250, 40));
        twoPanel.setMinimumSize(new java.awt.Dimension(250, 40));
        twoPanel.setPreferredSize(new java.awt.Dimension(250, 40));
        twoPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twoPanelMouseClicked(evt);
            }
        });
        twoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmployees.setFont(new java.awt.Font("Optima", 1, 16)); // NOI18N
        lblEmployees.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployees.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmployees.setText("MANAGE EMPLOYEES");
        lblEmployees.setMaximumSize(new java.awt.Dimension(180, 20));
        lblEmployees.setMinimumSize(new java.awt.Dimension(180, 20));
        lblEmployees.setPreferredSize(new java.awt.Dimension(180, 20));
        twoPanel.add(lblEmployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 160, -1));

        iconEmployees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manageemployees.png"))); // NOI18N
        twoPanel.add(iconEmployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        menuPanel.add(twoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        threePanel.setBackground(new java.awt.Color(36, 47, 65));
        threePanel.setMaximumSize(new java.awt.Dimension(250, 40));
        threePanel.setMinimumSize(new java.awt.Dimension(250, 40));
        threePanel.setPreferredSize(new java.awt.Dimension(250, 40));
        threePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                threePanelMouseClicked(evt);
            }
        });
        threePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsers.setFont(new java.awt.Font("Optima", 1, 16)); // NOI18N
        lblUsers.setForeground(new java.awt.Color(255, 255, 255));
        lblUsers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsers.setText("MANAGE USERS");
        lblUsers.setMaximumSize(new java.awt.Dimension(180, 20));
        lblUsers.setMinimumSize(new java.awt.Dimension(180, 20));
        lblUsers.setPreferredSize(new java.awt.Dimension(180, 20));
        threePanel.add(lblUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 120, -1));

        iconUsers.setForeground(new java.awt.Color(255, 255, 255));
        iconUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manageuser.png"))); // NOI18N
        iconUsers.setToolTipText("");
        threePanel.add(iconUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menuPanel.add(threePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        lblText.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblText.setForeground(new java.awt.Color(255, 255, 255));
        lblText.setText("Currently Logged in as:");
        menuPanel.add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        cardWorkPanel.setBackground(new java.awt.Color(36, 47, 65));
        cardWorkPanel.setMinimumSize(new java.awt.Dimension(1190, 848));
        cardWorkPanel.setPreferredSize(new java.awt.Dimension(1190, 848));
        cardWorkPanel.setLayout(new java.awt.CardLayout());

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ENTERPRISEADMIN.png"))); // NOI18N
        cardWorkPanel.add(lblTitle, "card2");

        add(cardWorkPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void twoPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoPanelMouseClicked
        // TODO add your handling code here:
        setColor(twoPanel);
        resetColor(new JPanel[]{onePanel,threePanel});
        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(cardWorkPanel, enterprise.getOrganizationDirectory());
        cardWorkPanel.add("manageEmployeeJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) cardWorkPanel.getLayout();
        layout.next(cardWorkPanel);
    }//GEN-LAST:event_twoPanelMouseClicked

    private void onePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onePanelMouseClicked
        // TODO add your handling code here:
        setColor(onePanel);
        resetColor(new JPanel[]{twoPanel,threePanel});
        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(cardWorkPanel, enterprise.getOrganizationDirectory(),account,enterprise);
        cardWorkPanel.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) cardWorkPanel.getLayout();
        layout.next(cardWorkPanel);
    }//GEN-LAST:event_onePanelMouseClicked

    private void threePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threePanelMouseClicked
        // TODO add your handling code here:
        setColor(threePanel);
        resetColor(new JPanel[]{onePanel,twoPanel});
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(cardWorkPanel, enterprise);
        cardWorkPanel.add("ManageUserAccountJPanel", muajp);
        CardLayout layout = (CardLayout) cardWorkPanel.getLayout();
        layout.next(cardWorkPanel);
    }//GEN-LAST:event_threePanelMouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardWorkPanel;
    private javax.swing.JLabel iconEmployees;
    private javax.swing.JLabel iconOrganizations;
    private javax.swing.JLabel iconUsers;
    private javax.swing.JLabel lblEmployees;
    private javax.swing.JLabel lblOrganizations;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsers;
    private javax.swing.JLabel lblValue;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel onePanel;
    private javax.swing.JPanel threePanel;
    private javax.swing.JPanel twoPanel;
    // End of variables declaration//GEN-END:variables
    private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(23,35,51));
    }
    private void resetColor(JPanel [] pane)
    {
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(36,47,65));
           
        }
    }
}